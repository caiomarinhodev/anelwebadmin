// @SOURCE:C:/Users/Caio/Downloads/anelwebdev/salaorocha-master/conf/routes
// @HASH:904e895f9173c80ab76453c4983a9bca2f506e72
// @DATE:Thu Jul 23 19:02:17 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseAssets {


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:25
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/assets/")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:15
def deactive(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deactive/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                        

// @LINE:8
def decrements(id:Long, code:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/decrements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/etnaruatserlena/" + implicitly[PathBindable[Integer]].unbind("code", code))
}
                        

// @LINE:7
def getUser(id:Long, code:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/etnaruatserlena/" + implicitly[PathBindable[Integer]].unbind("code", code))
}
                        

// @LINE:14
def renderEdituser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:12
def dashboard(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "app")
}
                        

// @LINE:19
def incrementa(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "incrementa")
}
                        

// @LINE:13
def transactions(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "transactions")
}
                        

// @LINE:16
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:6
def getUsers(code:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/etnaruatserlena/" + implicitly[PathBindable[Integer]].unbind("code", code))
}
                        

// @LINE:20
def addUsuario(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add/usuario")
}
                        

// @LINE:11
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:18
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseAssets {


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deactive/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:15
def deactive : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deactive",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deactive/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:8
def decrements : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.decrements",
   """
      function(id,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/decrements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/etnaruatserlena/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:7
def getUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUser",
   """
      function(id,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/etnaruatserlena/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:14
def renderEdituser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderEdituser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app"})
      }
   """
)
                        

// @LINE:19
def incrementa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.incrementa",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "incrementa"})
      }
   """
)
                        

// @LINE:13
def transactions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.transactions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactions"})
      }
   """
)
                        

// @LINE:16
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUsers",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/etnaruatserlena/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:20
def addUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addUsuario",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add/usuario"})
      }
   """
)
                        

// @LINE:11
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:18
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseAssets {


// @LINE:25
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:15
def deactive(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deactive(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deactive", Seq(classOf[Long]), "GET", """""", _prefix + """deactive/$id<[^/]+>/""")
)
                      

// @LINE:8
def decrements(id:Long, code:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.decrements(id, code), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "decrements", Seq(classOf[Long], classOf[Integer]), "GET", """""", _prefix + """users/decrements/$id<[^/]+>/etnaruatserlena/$code<[^/]+>""")
)
                      

// @LINE:7
def getUser(id:Long, code:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUser(id, code), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getUser", Seq(classOf[Long], classOf[Integer]), "GET", """""", _prefix + """users/$id<[^/]+>/etnaruatserlena/$code<[^/]+>""")
)
                      

// @LINE:14
def renderEdituser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderEdituser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderEdituser", Seq(classOf[Long]), "GET", """""", _prefix + """edit/$id<[^/]+>""")
)
                      

// @LINE:12
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.dashboard(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "dashboard", Seq(), "GET", """""", _prefix + """app""")
)
                      

// @LINE:19
def incrementa(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.incrementa(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "incrementa", Seq(), "POST", """""", _prefix + """incrementa""")
)
                      

// @LINE:13
def transactions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.transactions(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "transactions", Seq(), "GET", """""", _prefix + """transactions""")
)
                      

// @LINE:16
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def getUsers(code:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUsers(code), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getUsers", Seq(classOf[Integer]), "GET", """ WEB SERVICE""", _prefix + """users/etnaruatserlena/$code<[^/]+>""")
)
                      

// @LINE:20
def addUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addUsuario(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUsuario", Seq(), "POST", """""", _prefix + """add/usuario""")
)
                      

// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ PAGES""", _prefix + """""")
)
                      

// @LINE:18
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      

}
                          
}
        
    