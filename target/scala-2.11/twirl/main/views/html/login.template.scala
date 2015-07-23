
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>A W A | Log in</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.4 -->
    <link href="/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet"
          type="text/css"/>
    <!-- Theme style -->
    <link href="/assets/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
    <!-- iCheck -->
    <link href="/assets/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>Anel</b> Web Admin</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">Faça login para iniciar uma sessão.</p>

        <form action="/login" method="post">
            <div class="form-group has-feedback">
                <input type="text" id="login" name="login" class="form-control" placeholder="Login" required/>
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" id="senha" name="senha" class="form-control" placeholder="Senha" required/>
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <button type="submit" id="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                </div>
            </div>
        </form>
    </div>
    <input id="erro" type="hidden" value="""),_display_(/*51.43*/message),format.raw/*51.50*/(""" """),format.raw/*51.51*/(""">
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 2.1.4 -->
<script src="/assets/plugins/jQuery/jQuery-2.1.4.min.js" type="text/javascript"></script>
<!-- Bootstrap 3.3.2 JS -->
<script src="/assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="/assets/plugins/lib/overHang.min.js" type="text/javascript"></script>

<script>
    $(document ).ready(function()"""),format.raw/*63.34*/("""{"""),format.raw/*63.35*/("""
        """),format.raw/*64.9*/("""var text = $('#erro' ).val();
        if(text.length > 3)"""),format.raw/*65.28*/("""{"""),format.raw/*65.29*/("""
            """),format.raw/*66.13*/("""$("body").overHang("""),format.raw/*66.32*/("""{"""),format.raw/*66.33*/("""
            """),format.raw/*67.13*/("""// The activity
            activity : "notification",
            // Use default duration (1.5)
            // duration : 1.5,
            // Custom message
            message : "Credenciais Invalidas!",
            // Custom color or theme
            col : "alizarin"
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/(""");
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""");
</script>

</body>
</html>
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 23 19:02:18 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/anelwebdev/salaorocha-master/app/views/login.scala.html
                  HASH: 39dd4f3f1eca3948e8f3595bac603c109e85d10b
                  MATRIX: 723->1|828->18|856->20|3247->2384|3275->2391|3304->2392|3756->2816|3785->2817|3822->2827|3908->2885|3937->2886|3979->2900|4026->2919|4055->2920|4097->2934|4417->3226|4446->3227|4485->3239|4514->3240|4547->3246|4575->3247
                  LINES: 26->1|29->1|30->2|79->51|79->51|79->51|91->63|91->63|92->64|93->65|93->65|94->66|94->66|94->66|95->67|103->75|103->75|104->76|104->76|105->77|105->77
                  -- GENERATED --
              */
          