package controllers;

import models.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.List;

/**
 * Created by Caio on 31/05/2015.
 */
public class Manager {

    private static GenericDAO dao = new GenericDAO();

    // Atividade

    public static void addUsuario(String nome, String data_nascimento, String endereco, String telefone, String cpf, int total){
        Usuario u = new Usuario(nome,data_nascimento,endereco,telefone,cpf,total);
        dao.persist(u);
        dao.flush();
    }

    public static Usuario getUsuario(long id){
        return dao.findByEntityId(Usuario.class,id);
    }

    public static Admin getAdmin(String login){
        List<Admin> l = dao.findByAttributeName(Admin.class.getName(),"login", login);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static boolean incrementaTotal(int t, long iduser){
        Usuario u = getUsuario(iduser);
        if(u!=null){
            u.setTotal(u.getTotal()+t);
            dao.merge(u);
            String descricao = "Admin aumentou o valor de "+ t;
            DateTime now = new DateTime(System.currentTimeMillis(), DateTimeZone.forID("America/Sao_Paulo"));
            DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
            System.out.println("Current time is: " + now);
            Transacao tr = new Transacao(descricao,dtf.print(now),iduser);
            dao.persist(tr);
            dao.flush();
            return true;
        }
        return false;
    }

    public static boolean decrementaTotal(int t, long iduser){
        Usuario u = getUsuario(iduser);
        if(u!=null){
            if(u.getTotal()>0){
                u.setTotal(u.getTotal() - t);
                dao.merge(u);
                String descricao = "Bateu cartao na leitora";
                DateTime now = new DateTime(System.currentTimeMillis(), DateTimeZone.forID("America/Sao_Paulo"));
                DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
                System.out.println("Current time is: " + now);
                Transacao tr = new Transacao(descricao,dtf.print(now),iduser);
                dao.persist(tr);
                dao.flush();
                return true;
            }
        }
        return false;
    }

    public static void setCpfUsuario(long id, String cpf){
        Usuario u = getUsuario(id);
        if(u!=null){
            u.setCpf(cpf);
            dao.merge(u);
            dao.flush();
        }
    }

    public static Usuario getUsuario(String cpf){
        List<Usuario> l = dao.findByAttributeName(Usuario.class.getName(),"cpf",cpf);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static void setNomeUsuario(long id, String nome){
        Usuario u = getUsuario(id);
        if(u!=null){
            u.setNome(nome);
            dao.merge(u);
            dao.flush();
        }
    }

    public static void removeUsuario(Usuario u){
        if(u!=null){
            dao.remove(u);
            dao.flush();
        }
    }

    public static void removeUsuario(long id){
        Usuario a= dao.findByEntityId(Usuario.class,id);
        if(a!=null){
            dao.remove(a);
            dao.flush();
        }
    }

    public static List<Usuario> getAllUsers(){
        return dao.findAllByClassName(Usuario.class.getName());
    }

    public static List<Transacao> getAllTransactions(){
        return dao.findAllByClassName(Transacao.class.getName());
    }


}
