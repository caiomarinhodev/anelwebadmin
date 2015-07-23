
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
object transacoes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                            <span class="hidden-xs">"""),_display_(/*58.54*/Manager/*58.61*/.getAdmin("anelroute").getNome),format.raw/*58.91*/("""</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="/assets/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image"/>

                                <p>
                                """),_display_(/*66.34*/Manager/*66.41*/.getAdmin("anelroute").getNome),format.raw/*66.71*/("""
                                """),format.raw/*67.33*/("""</p>
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
                    <p>"""),_display_(/*90.25*/Manager/*90.32*/.getAdmin("anelroute").getNome),format.raw/*90.62*/("""</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">MENU</li>
                <li>
                    <a href="/app">
                        <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                    </a>
                </li>
                <li class="active treeview">
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
                Transações
                <small>Version 1.0</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active">Transações</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-md-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">Tabela de Transações</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <table id="tabela" class="table table-bordered table-striped dataTable">
                                        <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>TRANSACAO</th>
                                            <th>DATA/HORA</th>
                                            <th>CLIENTE</th>
                                            <th>TELEFONE</th>
                                            <th>TOTAL</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                            """),_display_(/*150.46*/for(tr <- Manager.getAllTransactions) yield /*150.83*/{_display_(Seq[Any](format.raw/*150.84*/("""
                                                """),format.raw/*151.49*/("""<tr>
                                                    <td>"""),_display_(/*152.58*/tr/*152.60*/.getId),format.raw/*152.66*/("""</td>
                                                    <td>"""),_display_(/*153.58*/tr/*153.60*/.getDescricao),format.raw/*153.73*/("""</td>
                                                    <td>"""),_display_(/*154.58*/tr/*154.60*/.getData_hora),format.raw/*154.73*/("""</td>
                                                    <td>"""),_display_(/*155.58*/Manager/*155.65*/.getUsuario(tr.getClienteid).getNome),format.raw/*155.101*/("""</td>
                                                    <td>"""),_display_(/*156.58*/Manager/*156.65*/.getUsuario(tr.getClienteid).getTelefone),format.raw/*156.105*/("""</td>
                                                    <td>"""),_display_(/*157.58*/Manager/*157.65*/.getUsuario(tr.getClienteid).getTotal),format.raw/*157.102*/("""</td>
                                                </tr>
                                            """)))}),format.raw/*159.46*/("""

                                        """),format.raw/*161.41*/("""</tbody>
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

<script src="/assets/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="/assets/plugins/datatables/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function() """),format.raw/*200.34*/("""{"""),format.raw/*200.35*/("""
        """),format.raw/*201.9*/("""$('#tabela').dataTable();
    """),format.raw/*202.5*/("""}"""),format.raw/*202.6*/(""" """),format.raw/*202.7*/(""");
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
                  DATE: Thu Jul 23 19:02:19 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/anelwebdev/salaorocha-master/app/views/transacoes.scala.html
                  HASH: 619db0dbc257c89d0f15c47ec7fbf046f4d374f4
                  MATRIX: 721->1|810->3|838->5|3803->2943|3819->2950|3870->2980|4280->3363|4296->3370|4347->3400|4409->3434|5376->4374|5392->4381|5443->4411|8051->6991|8105->7028|8145->7029|8224->7079|8315->7142|8327->7144|8355->7150|8447->7214|8459->7216|8494->7229|8586->7293|8598->7295|8633->7308|8725->7372|8742->7379|8801->7415|8893->7479|8910->7486|8973->7526|9065->7590|9082->7597|9142->7634|9281->7741|9354->7785|10882->9284|10912->9285|10950->9295|11009->9326|11038->9327|11067->9328
                  LINES: 26->1|29->1|30->2|86->58|86->58|86->58|94->66|94->66|94->66|95->67|118->90|118->90|118->90|178->150|178->150|178->150|179->151|180->152|180->152|180->152|181->153|181->153|181->153|182->154|182->154|182->154|183->155|183->155|183->155|184->156|184->156|184->156|185->157|185->157|185->157|187->159|189->161|228->200|228->200|229->201|230->202|230->202|230->202
                  -- GENERATED --
              */
          