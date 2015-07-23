// @SOURCE:C:/Users/Caio/Downloads/anelwebdev/salaorocha-master/conf/routes
// @HASH:904e895f9173c80ab76453c4983a9bca2f506e72
// @DATE:Thu Jul 23 19:02:17 BRT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_getUsers0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/etnaruatserlena/"),DynamicPart("code", """[^/]+""",true))))
private[this] lazy val controllers_Application_getUsers0_invoker = createInvoker(
controllers.Application.getUsers(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getUsers", Seq(classOf[Integer]),"GET", """ WEB SERVICE""", Routes.prefix + """users/etnaruatserlena/$code<[^/]+>"""))
        

// @LINE:7
private[this] lazy val controllers_Application_getUser1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true),StaticPart("/etnaruatserlena/"),DynamicPart("code", """[^/]+""",true))))
private[this] lazy val controllers_Application_getUser1_invoker = createInvoker(
controllers.Application.getUser(fakeValue[Long], fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getUser", Seq(classOf[Long], classOf[Integer]),"GET", """""", Routes.prefix + """users/$id<[^/]+>/etnaruatserlena/$code<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_decrements2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/decrements/"),DynamicPart("id", """[^/]+""",true),StaticPart("/etnaruatserlena/"),DynamicPart("code", """[^/]+""",true))))
private[this] lazy val controllers_Application_decrements2_invoker = createInvoker(
controllers.Application.decrements(fakeValue[Long], fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "decrements", Seq(classOf[Long], classOf[Integer]),"GET", """""", Routes.prefix + """users/decrements/$id<[^/]+>/etnaruatserlena/$code<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_Application_index3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index3_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ PAGES""", Routes.prefix + """"""))
        

// @LINE:12
private[this] lazy val controllers_Application_dashboard4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("app"))))
private[this] lazy val controllers_Application_dashboard4_invoker = createInvoker(
controllers.Application.dashboard(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "dashboard", Nil,"GET", """""", Routes.prefix + """app"""))
        

// @LINE:13
private[this] lazy val controllers_Application_transactions5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("transactions"))))
private[this] lazy val controllers_Application_transactions5_invoker = createInvoker(
controllers.Application.transactions(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "transactions", Nil,"GET", """""", Routes.prefix + """transactions"""))
        

// @LINE:14
private[this] lazy val controllers_Application_renderEdituser6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_renderEdituser6_invoker = createInvoker(
controllers.Application.renderEdituser(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderEdituser", Seq(classOf[Long]),"GET", """""", Routes.prefix + """edit/$id<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_Application_deactive7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deactive/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
private[this] lazy val controllers_Application_deactive7_invoker = createInvoker(
controllers.Application.deactive(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deactive", Seq(classOf[Long]),"GET", """""", Routes.prefix + """deactive/$id<[^/]+>/"""))
        

// @LINE:16
private[this] lazy val controllers_Application_logout8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout8_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:18
private[this] lazy val controllers_Application_login9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login9_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:19
private[this] lazy val controllers_Application_incrementa10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("incrementa"))))
private[this] lazy val controllers_Application_incrementa10_invoker = createInvoker(
controllers.Application.incrementa(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "incrementa", Nil,"POST", """""", Routes.prefix + """incrementa"""))
        

// @LINE:20
private[this] lazy val controllers_Application_addUsuario11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add/usuario"))))
private[this] lazy val controllers_Application_addUsuario11_invoker = createInvoker(
controllers.Application.addUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUsuario", Nil,"POST", """""", Routes.prefix + """add/usuario"""))
        

// @LINE:25
private[this] lazy val controllers_Assets_at12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:26
private[this] lazy val controllers_Assets_at13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deactive/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """deactive/assets/$file<.+>"""))
        

// @LINE:27
private[this] lazy val controllers_Assets_at14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """add/assets/$file<.+>"""))
        

// @LINE:28
private[this] lazy val controllers_Assets_at15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """edit/assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/etnaruatserlena/$code<[^/]+>""","""controllers.Application.getUsers(code:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>/etnaruatserlena/$code<[^/]+>""","""controllers.Application.getUser(id:Long, code:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/decrements/$id<[^/]+>/etnaruatserlena/$code<[^/]+>""","""controllers.Application.decrements(id:Long, code:Integer)"""),("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """app""","""controllers.Application.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """transactions""","""controllers.Application.transactions()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/$id<[^/]+>""","""controllers.Application.renderEdituser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deactive/$id<[^/]+>/""","""controllers.Application.deactive(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """incrementa""","""controllers.Application.incrementa()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add/usuario""","""controllers.Application.addUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deactive/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_getUsers0_route(params) => {
   call(params.fromPath[Integer]("code", None)) { (code) =>
        controllers_Application_getUsers0_invoker.call(controllers.Application.getUsers(code))
   }
}
        

// @LINE:7
case controllers_Application_getUser1_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Integer]("code", None)) { (id, code) =>
        controllers_Application_getUser1_invoker.call(controllers.Application.getUser(id, code))
   }
}
        

// @LINE:8
case controllers_Application_decrements2_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Integer]("code", None)) { (id, code) =>
        controllers_Application_decrements2_invoker.call(controllers.Application.decrements(id, code))
   }
}
        

// @LINE:11
case controllers_Application_index3_route(params) => {
   call { 
        controllers_Application_index3_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:12
case controllers_Application_dashboard4_route(params) => {
   call { 
        controllers_Application_dashboard4_invoker.call(controllers.Application.dashboard())
   }
}
        

// @LINE:13
case controllers_Application_transactions5_route(params) => {
   call { 
        controllers_Application_transactions5_invoker.call(controllers.Application.transactions())
   }
}
        

// @LINE:14
case controllers_Application_renderEdituser6_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_renderEdituser6_invoker.call(controllers.Application.renderEdituser(id))
   }
}
        

// @LINE:15
case controllers_Application_deactive7_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deactive7_invoker.call(controllers.Application.deactive(id))
   }
}
        

// @LINE:16
case controllers_Application_logout8_route(params) => {
   call { 
        controllers_Application_logout8_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:18
case controllers_Application_login9_route(params) => {
   call { 
        controllers_Application_login9_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:19
case controllers_Application_incrementa10_route(params) => {
   call { 
        controllers_Application_incrementa10_invoker.call(controllers.Application.incrementa())
   }
}
        

// @LINE:20
case controllers_Application_addUsuario11_route(params) => {
   call { 
        controllers_Application_addUsuario11_invoker.call(controllers.Application.addUsuario())
   }
}
        

// @LINE:25
case controllers_Assets_at12_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:26
case controllers_Assets_at13_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:27
case controllers_Assets_at14_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:28
case controllers_Assets_at15_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at15_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     