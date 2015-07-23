package controllers;

import models.Admin;
import models.Usuario;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.List;

public class Application extends Controller {
    @Transactional
    public static Result index() {
        String lo = session().get("login");
        Admin ad = Manager.getAdmin(lo);
        if (ad != null) {
            return dashboard();
        }
        return ok(login.render(""));
    }

    @Transactional
    public static Result login() {
        DynamicForm r = Form.form().bindFromRequest();
        String l = r.get("login");
        String p = r.get("senha");
        Admin ad = Manager.getAdmin("anelroute");
        if (ad != null) {
            if (l.equals(ad.getLogin())) {
                if (p.equals(ad.getSenha())) {
                    session().put("login", l);
                    return dashboard();
                }
            }
        }
        String msgerror = "Credenciais Invalidas!";
        return ok(login.render(msgerror));
    }

    @Transactional
    public static Result dashboard() {
        String lo = session().get("login");
        Admin ad = Manager.getAdmin(lo);
        if (ad != null) {
            return ok(index.render());
        }
        return ok(login.render("Você precisa logar no sistema!"));
    }


    @Transactional
    public static Result incrementa() {
        DynamicForm r = Form.form().bindFromRequest();
        Long id = Long.parseLong(r.get("id"));
        int total = Integer.parseInt(r.get("total"));
        Manager.incrementaTotal(total, id);
        return index();
    }


    @Transactional
    public static Result addUsuario() {
        DynamicForm r = Form.form().bindFromRequest();
        String nome = r.get("nome");
        String data_nascimento = r.get("data");
        String endereco = r.get("endereco");
        String telefone = r.get("telefone");
        String cpf = r.get("cpf");
        int total = Integer.parseInt(r.get("total"));
        Manager.addUsuario(nome, data_nascimento, endereco, telefone, cpf, total);
        return secondscreen(Manager.getUsuario(cpf));
    }

    @Transactional
    public static Result renderEdit(Long id) {
        Admin admin = Manager.getAdmin(session().get("login"));
        Usuario u = Manager.getUsuario(id);
        return ok(edit.render(u));
    }

    @Transactional
    public static Result logout() {
        session().clear();
        return index();
    }

    @Transactional
    public static Result secondscreen(Usuario user) {
        return ok(action.render(user));
    }

    @Transactional
    public static Result transactions() {
        String lo = session().get("login");
        Admin ad = Manager.getAdmin(lo);
        if (ad != null) {
            return ok(transacoes.render());
        }
        return ok(login.render("Você precisa logar no sistema!"));
    }

    @Transactional
    public static Result renderEdituser(long id) {
        Usuario u = Manager.getUsuario(id);
        return ok(edit.render(u));
    }

    @Transactional
    public static Result deactive(long id) {
        Manager.removeUsuario(id);
        return dashboard();
    }


    // REST API
    @Transactional
    public static Result getUsers(Integer code) {
        if (code == 666) {
            List<Usuario> lista = Manager.getAllUsers();
            return ok(Json.toJson(lista));
        }
        return ok();
    }

    @Transactional
    public static Result getUser(long id, Integer code) {
        if (code == 666) {
            Usuario u = Manager.getUsuario(id);
            return ok(Json.toJson(u));
        }
        return ok();
    }

    @Transactional
    public static Result decrements(long id, Integer code) {
        if (code == 666) {
            Manager.decrementaTotal(1, id);
            Usuario u = Manager.getUsuario(id);
            return ok(Json.toJson(u));
        }
        String str = "{result: 0}";
        return ok(Json.parse(str));
    }
}
