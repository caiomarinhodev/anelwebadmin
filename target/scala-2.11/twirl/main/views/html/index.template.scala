
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ANEL WEB ADMIN</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.4 -->
    <link href="/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet"
          type="text/css"/>
    <!-- Ionicons -->
    <link href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" rel="stylesheet" type="text/css"/>
    <!-- Theme style -->
    <link href="/assets/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link href="/assets/dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css"/>

    <link href="/assets/plugins/datatables/dataTables.bootstrap.min.js" rel="stylesheet" type="text/css"/>
    <link href="/assets/plugins/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
    <link href="/assets/plugins/lib/datepicker/css/datepicker.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="skin-blue sidebar-mini">
<div class="wrapper">

    <header class="main-header">

        <!-- Logo -->
        <a href="#" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>AWA</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Anel</b> Web Admin</span>
        </a>

        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="/assets/dist/img/user2-160x160.jpg" class="user-image" alt="User Image"/>
                            <span class="hidden-xs">"""),_display_(/*59.54*/Manager/*59.61*/.getAdmin("anelroute").getNome),format.raw/*59.91*/("""</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="/assets/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image"/>

                                <p>
                                   """),_display_(/*67.37*/Manager/*67.44*/.getAdmin("anelroute").getNome),format.raw/*67.74*/("""
                                """),format.raw/*68.33*/("""</p>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer text-center">
                                <a href="/logout" class="btn btn-default btn-flat">Sign out</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>

        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="/assets/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image"/>
                </div>
                <div class="pull-left info">
                    <p> """),_display_(/*91.26*/Manager/*91.33*/.getAdmin("anelroute").getNome),format.raw/*91.63*/("""</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">MENU</li>
                <li class="active treeview">
                    <a href="/app">
                        <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                    </a>
                </li>
                <li>
                    <a href="/transactions">
                        <i class="fa fa-signal"></i> <span>Transacões</span>
                    </a>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Dashboard
                <small>Version 1.0</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active">Dashboard</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-lg-2"></div>
                <div class="col-lg-4 col-xs-12">
                    <!-- small box -->
                    <div class="small-box bg-aqua">
                        <div class="inner">
                            <h3>"""),_display_(/*136.34*/Manager/*136.41*/.getAllUsers.size()),format.raw/*136.60*/("""</h3>

                            <p>Clientes</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-person-add"></i>
                        </div>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-4 col-xs-12">
                    <!-- small box -->
                    <div class="small-box bg-orange">
                        <div class="inner">
                            <h3>"""),_display_(/*150.34*/Manager/*150.41*/.getAllTransactions.size()),format.raw/*150.67*/("""</h3>

                            <p>Transaçoes totais</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-bag"></i>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2"></div>
                <!-- ./col -->
            </div>

            <div class="row">
                <br/>
                <div class="col-md-4 col-md-offset-8">
                    <button class="btn btn-info btn-block"  data-toggle="modal" data-target="#adduser"><i class="fa fa-plus">&nbsp;Add Usuário</i> </button>
                </div>

            </div>
            <br/>
            <!-- /.row -->
            <div class="row">
                <div class="col-md-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">Tabela de Clientes</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <table id="tabela" class="table table-bordered table-striped dataTable">
                                        <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>NOME</th>
                                            <th>CPF</th>
                                            <th>DATA NASCIMENTO</th>
                                            <th>ENDEREÇO</th>
                                            <th>TELEFONE</th>
                                            <th>TOTAL</th>
                                            <th></th>
                                            <th></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                            """),_display_(/*197.46*/for(us <- Manager.getAllUsers) yield /*197.76*/{_display_(Seq[Any](format.raw/*197.77*/("""
                                                """),format.raw/*198.49*/("""<tr>
                                                    <td>"""),_display_(/*199.58*/us/*199.60*/.getId),format.raw/*199.66*/("""</td>
                                                    <td>"""),_display_(/*200.58*/us/*200.60*/.getNome),format.raw/*200.68*/("""</td>
                                                    <td>"""),_display_(/*201.58*/us/*201.60*/.getCpf),format.raw/*201.67*/("""</td>
                                                    <td>"""),_display_(/*202.58*/us/*202.60*/.getData_nascimento),format.raw/*202.79*/("""</td>
                                                    <td>"""),_display_(/*203.58*/us/*203.60*/.getEndereco),format.raw/*203.72*/("""</td>
                                                    <td>"""),_display_(/*204.58*/us/*204.60*/.getTelefone),format.raw/*204.72*/("""</td>
                                                    <td>"""),_display_(/*205.58*/us/*205.60*/.getTotal),format.raw/*205.69*/("""</td>
                                                    <td><a href="/edit/"""),_display_(/*206.73*/us/*206.75*/.getId),format.raw/*206.81*/(""""><span class="fa fa-edit"></span></a></td>
                                                    <td><a href="/deactive/"""),_display_(/*207.77*/us/*207.79*/.getId),format.raw/*207.85*/(""""><span class="fa fa-trash-o"></span></a></td>
                                                </tr>
                                            """)))}),format.raw/*209.46*/("""
                                        """),format.raw/*210.41*/("""</tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!-- /.box-body -->
                    </div>
                </div>
            </div>
        </section>
        <!-- /.content -->




        <div class="modal fade" id="adduser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Adicionar Usuario</h4>
                    </div>
                    <form method="post" action="/add/usuario">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-lg-8 col-lg-offset-2">
                                    <div class="form-group">
                                        <label>Nome</label>
                                        <input type="text" class="form-control" name="nome" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Data Nascimento</label>
                                        <input type="text" class="datepicker form-control" name="data" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Endereco</label>
                                        <input type="text" class="form-control" name="endereco" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Telefone</label>
                                        <input type="text" class="form-control" name="telefone" required>
                                    </div>
                                    <div class="form-group">
                                        <label>CPF</label>
                                        <input type="text" class="form-control" name="cpf" id="campocpf" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Total</label>
                                        <select class="form-control" name="total">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                            <option value="9">9</option>
                                            <option value="10">10</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Adicionar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>








    </div>
    <!-- /.content-wrapper -->

    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.0
        </div>
        <strong>Copyright &copy; 2015-2016. All rights reserved.</strong>
    </footer>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.1.4 -->
<script src="/assets/plugins/jQuery/jQuery-2.1.4.min.js" type="text/javascript"></script>
<!-- Bootstrap 3.3.2 JS -->
<script src="/assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<!-- FastClick -->
<script src="/assets/plugins/fastclick/fastclick.min.js" type="text/javascript"></script>
<!-- AdminLTE App -->
<script src="/assets/dist/js/app.min.js" type="text/javascript"></script>
<!-- SlimScroll 1.3.0 -->
<script src="/assets/plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<!-- AdminLTE for demo purposes -->
<script src="/assets/dist/js/demo.js" type="text/javascript"></script>
<script src="/assets/plugins/lib/mask.js"></script>
<script src="/assets/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script src="/assets/plugins/lib/datepicker/language.js"></script>
<script src="/assets/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="/assets/plugins/datatables/jquery.dataTables.min.js"></script>


<script>
    $(document).ready(function() """),format.raw/*322.34*/("""{"""),format.raw/*322.35*/("""
        """),format.raw/*323.9*/("""$("#campocpf").mask("999.999.999-99");
        $('.datepicker').datepicker("""),format.raw/*324.37*/("""{"""),format.raw/*324.38*/("""
            """),format.raw/*325.13*/("""format: "dd/mm/yyyy",
            todayBtn: "linked",
            clearBtn: true,
            language: "pt-BR"
        """),format.raw/*329.9*/("""}"""),format.raw/*329.10*/(""");
        $('#tabela').dataTable();
        $('[name=telefone]').mask("(99) 9 9999-9999");

    """),format.raw/*333.5*/("""}"""),format.raw/*333.6*/(""" """),format.raw/*333.7*/(""");
</script>
</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 23 19:02:18 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/anelwebdev/salaorocha-master/app/views/index.scala.html
                  HASH: 90162f0447dc7f5a78a200604d0626f9fcceb190
                  MATRIX: 716->1|805->3|833->5|3900->3045|3916->3052|3967->3082|4380->3468|4396->3475|4447->3505|4509->3539|5477->4480|5493->4487|5544->4517|7246->6191|7263->6198|7304->6217|7865->6750|7882->6757|7930->6783|10102->8927|10149->8957|10189->8958|10268->9008|10359->9071|10371->9073|10399->9079|10491->9143|10503->9145|10533->9153|10625->9217|10637->9219|10666->9226|10758->9290|10770->9292|10811->9311|10903->9375|10915->9377|10949->9389|11041->9453|11053->9455|11087->9467|11179->9531|11191->9533|11222->9542|11329->9621|11341->9623|11369->9629|11518->9750|11530->9752|11558->9758|11738->9906|11809->9948|17249->15359|17279->15360|17317->15370|17422->15446|17452->15447|17495->15461|17647->15585|17677->15586|17806->15687|17835->15688|17864->15689
                  LINES: 26->1|29->1|30->2|87->59|87->59|87->59|95->67|95->67|95->67|96->68|119->91|119->91|119->91|164->136|164->136|164->136|178->150|178->150|178->150|225->197|225->197|225->197|226->198|227->199|227->199|227->199|228->200|228->200|228->200|229->201|229->201|229->201|230->202|230->202|230->202|231->203|231->203|231->203|232->204|232->204|232->204|233->205|233->205|233->205|234->206|234->206|234->206|235->207|235->207|235->207|237->209|238->210|350->322|350->322|351->323|352->324|352->324|353->325|357->329|357->329|361->333|361->333|361->333
                  -- GENERATED --
              */
          