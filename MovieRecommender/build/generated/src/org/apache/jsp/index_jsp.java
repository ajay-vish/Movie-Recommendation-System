package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Connection.Config;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");



if(session.getAttribute("email")!=null){

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!--<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-func.js\"></script>-->\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Catamaran' rel='stylesheet'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Quicksand' rel='stylesheet'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">  \n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("<!--// hover-->\n");
      out.write("<link href=\"css/hover-min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("<!--slick--> <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\"/>\n");
      out.write("<link href=\"css/slick-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!--for navbarcss-->\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <!-- Stylesheet -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");

Connection conn=Config.Config();
String sql="SELECT * FROM moviesmetadata where popularity>140";
Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery(sql);  

Statement stmt1 = conn.createStatement();
String sql1="SELECT * FROM moviesmetadata where vote_count>800 ORDER BY vote_average DESC";
ResultSet rs1 = stmt1.executeQuery(sql1); 

      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("                      @font-face {\n");
      out.write("                font-family:\"Staatliches\";\n");
      out.write("                src: url(\"fonts/Staatliches-Regular.ttf\") format(\"truetype\");\n");
      out.write("            }\n");
      out.write("           @font-face {\n");
      out.write("    font-family: \"FiraSansCondensed-Bold\";\n");
      out.write("    src: url(\"fonts/FiraSansCondensed-Bold.otf\") format(\"opentype\");\n");
      out.write("}\n");
      out.write("            body{\n");
      out.write("                background-color: #182130;\n");
      out.write("                font-family: Catamaran;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("  .carousel {\n");
      out.write("  position: relative;\n");
      out.write("\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".centered {\n");
      out.write("    z-index: 9999;\n");
      out.write("\n");
      out.write("  position: absolute;\n");
      out.write("  top: 26%;\n");
      out.write("  margin-left: 100px;\n");
      out.write(" \n");
      out.write("   height: 55px;\n");
      out.write("  \n");
      out.write("  color: white;\n");
      out.write("  \n");
      out.write("  text-align: left;\n");
      out.write("}.circle{\n");
      out.write("    display: inline-block;\n");
      out.write("    position: relative;\n");
      out.write("  background: white;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  height: 10px;\n");
      out.write("  width: 10px;\n");
      out.write("  margin-bottom: 2px;\n");
      out.write("  margin-left: 15px;\n");
      out.write("  margin-right:  15px;\n");
      out.write("}\n");
      out.write(".car-title  span{\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: white;\n");
      out.write("    font-family: FiraSansCondensed-Bold;\n");
      out.write("    font-size: 90px;\n");
      out.write("    letter-spacing: -2px !important;\n");
      out.write("    font-weight: 1000;\n");
      out.write("    \n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("car-year{ \n");
      out.write("    font-weight: 900 !important;\n");
      out.write("   font-size: 23px;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".car-description{\n");
      out.write("    font-weight: 900;\n");
      out.write("    padding-top: 30px;\n");
      out.write("   font-size: 20px;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".example_d {\n");
      out.write("color: #20bf6b !important;\n");
      out.write("text-transform: uppercase;\n");
      out.write("background: #ffffff;\n");
      out.write("padding: 20px;\n");
      out.write("border: 4px solid white;\n");
      out.write("border-radius: 6px;\n");
      out.write("display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".example_d:hover {\n");
      out.write("color: white !important;\n");
      out.write("border-radius: 3px;\n");
      out.write("background-color: black;\n");
      out.write("text-decoration: none;\n");
      out.write("\n");
      out.write("font-size: 20px;\n");
      out.write("\n");
      out.write("border: solid white 1px;\n");
      out.write("transition: all 0.3s ease 0s;\n");
      out.write("}\n");
      out.write(".car-description{\n");
      out.write("    font-size: 20px;\n");
      out.write("      font-family: Catamaran;\n");
      out.write("   max-width: 500px;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/*//viewBy*/\n");
      out.write(".viewBy {\n");
      out.write("    width: 68%;\n");
      out.write("    float:left;\n");
      out.write("    height: 50px;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 55px;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: 900;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    font-family: FiraSansCondensed-Bold;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("/*// card*/\n");
      out.write("/* Slow-motion Zoom Container */\n");
      out.write(".img-hover-zoom--slowmo img {\n");
      out.write("  transform-origin: 50% 65%;\n");
      out.write("  transition: transform 2s, filter 2s ease-in-out;\n");
      out.write("  filter: brightness(150%);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Transformation */\n");
      out.write(".card{\n");
      out.write("    background-color: #04040e;\n");
      out.write("    border: none;\n");
      out.write("    margin-right: 13px;\n");
      out.write("    height: 400px;\n");
      out.write("    overflow-y:hidden !important;\n");
      out.write("}\n");
      out.write(".card a{\n");
      out.write("    text-align: center;\n");
      out.write("    overflow:hidden;\n");
      out.write("}\n");
      out.write(".card-title{\n");
      out.write("    text-decoration: none;\n");
      out.write("    overflow-wrap: break-word;\n");
      out.write("    padding-left: 3px;\n");
      out.write("      font-weight:600;\n");
      out.write("      text-align: center;\n");
      out.write("      color: white;\n");
      out.write("      \n");
      out.write("}\n");
      out.write(".card img {\n");
      out.write("    height: 100%;\n");
      out.write("  transform-origin: 50% 65%;\n");
      out.write("  transition: transform 5s, filter 3s ease-in-out;\n");
      out.write("  filter: brightness(150%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover img {\n");
      out.write("  filter: brightness(100%);\n");
      out.write("  transform: scale(1.2);\n");
      out.write("}\n");
      out.write(".showing{\n");
      out.write("    width: 30%;\n");
      out.write("    font-weight: 900;\n");
      out.write("    font-size: 20px;\n");
      out.write("    float: right;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("/*// navbar css*/\n");
      out.write("/*// navbar css*/\n");
      out.write(".navig{\n");
      out.write("    width: 100%;\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: 9999;\n");
      out.write("    background-color: transparent;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".navig{\n");
      out.write("    background-color: transparent !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".actualnav{\n");
      out.write("    float:right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".actualnav ul{\n");
      out.write("    margin-right: 30px;\n");
      out.write("    float: right;\n");
      out.write("    display:inline;\n");
      out.write("    height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".actualnav li{color:white !important;\n");
      out.write("   font-weight: 600;\n");
      out.write("   font-size: 23px;\n");
      out.write("    margin-left: 30px;\n");
      out.write("    display: inline-block;\n");
      out.write("    position: relative;   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write(".notification {\n");
      out.write("    color: white;\n");
      out.write("  text-decoration: none;\n");
      out.write("  padding: 11px 20px;\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("  border-radius: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".notification:hover {\n");
      out.write("  background: white;\n");
      out.write("  color:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".notification .badge {\n");
      out.write("  position: absolute;\n");
      out.write("  top: -10px;\n");
      out.write("  right: -10px;\n");
      out.write("  padding: 5px 10px;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  background: red;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".slick-prev:before {\n");
      out.write("    content: \"\" !important;\n");
      out.write("    font-family: 'FontAwesome' !important;\n");
      out.write("    font-size: 22px !important;\n");
      out.write("}\n");
      out.write(".slick-next:before {\n");
      out.write("    content: \"\" !important;\n");
      out.write("    font-family: 'FontAwesome' !important;\n");
      out.write("    font-size: 22px !important;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("\n");
      out.write("/*//search*/\n");
      out.write("form{\n");
      out.write("    \n");
      out.write("    position: relative;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 340px;\n");
      out.write("    transform: translate(-50%,-50%);\n");
      out.write("    transition: all 1s;\n");
      out.write("    width: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    background: white;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border-radius: 25px;\n");
      out.write("    border: 4px solid white;\n");
      out.write("    padding: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    width: 100%;;\n");
      out.write("    height: 42.5px;\n");
      out.write("    line-height: 30px;\n");
      out.write("    outline: 0;\n");
      out.write("    border: 0;\n");
      out.write("    display: none;\n");
      out.write("    font-size: 1em;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    padding: 0 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa{\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 10px;\n");
      out.write("    width: 42.5px;\n");
      out.write("    height: 42.5px;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    right: 0;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    color: #07051a;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 1.2em;\n");
      out.write("    transition: all 1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form:hover{\n");
      out.write("    width: 500px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form:hover input{\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form:hover .fa{\n");
      out.write("    background: #07051a;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".view{\n");
      out.write("  \n");
      out.write("    float:left;\n");
      out.write("    \n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 55px;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: 900;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    font-family: FiraSansCondensed-Bold;\n");
      out.write("}\n");
      out.write(".show{\n");
      out.write("    text-align: right;\n");
      out.write("    padding-top: 25px;\n");
      out.write("    font-weight: 900;\n");
      out.write("    font-size: 20px;\n");
      out.write("    float: right;\n");
      out.write("    padding-right: 20px;\n");
      out.write("    color: white;}\n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String email=session.getAttribute("email").toString();
     PreparedStatement pst1 = conn.prepareStatement("select * from share where shareTo=? and isRead=0");
     pst1.setString(1, email);
     ResultSet rst1 = pst1.executeQuery();
    int counter=0;
     while(rst1.next()){
     counter++;
     }
     
      out.write("\n");
      out.write("<!--real carousel-->\n");
      out.write("     <div class=\"navig\">\n");
      out.write("         <div class=\"logo\" style=\"float: left; width: 34%; display: inline-block; position: relative; margin-top: 26px !important; padding-top: 24px;\">\n");
      out.write("             <form action=\"SearchByGenre.jsp\" method=\"post\">\n");
      out.write("                 <input type=\"search\" name=\"search\" placeholder=\"Find any Movie\">\n");
      out.write("  <i class=\"fa fa-search\"></i>\n");
      out.write("</form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"actualnav\" style=\"float: right; display: inline-block; margin-top: 15px;\">\n");
      out.write("        <ul>\n");
      out.write("            <a href=\"index.jsp\"><li>Home</li></a>\n");
      out.write("            <a href=\"mySpace.jsp\"><li>My Space</li></a>\n");
      out.write("            <a href=\"aboutUs/about.html\"> <li>About</li></a>\n");
      out.write("           \n");
      out.write("            <li><a href=\"sharedMovies.jsp\" class=\"notification\">\n");
      out.write("  <span>Inbox</span>\n");
      out.write("  <span class=\"badge\">");
      out.print(counter);
      out.write("</span>\n");
      out.write("</a></li>\n");
      out.write("<a href=\"aboutUs/contact.html\"><li>Contact</li></a>\n");
      out.write("            <li><a href=\"logout.jsp\" >Logout</a></li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<section class=\"carousel\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <div class=\"carousel-poster\">\n");
      out.write("                <div style=\"background-image: url(images/469913.jpg); background-size: cover; height: 800px;\">\n");
      out.write("<!--                    <img src=\"images/wp1851143-the-conjuring-wallpapers.jpg\" width=\"100%\" height=\"700px\" alt=\"\"/>-->\n");
      out.write("                             <div class=\"centered\">\n");
      out.write("                                 <div class=\"car-title\"><a href=\"details.jsp?original_title=Batman: Under the Red Hood\"><span>BATMAN\n");
      out.write("                                     </span></a></div>\n");
      out.write("                                 <span class=\"car-year\">2007</span><div class=\"circle\"></div> <span class=\"car-year\">ACTION, DRAMA, ADVENTURES </span>\n");
      out.write("                                     <span class=\"car-subtitle\"></span>\n");
      out.write("                                     <span class=\"car-description\">Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.</span>\n");
      out.write("                \n");
      out.write("                              </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                   <div style=\"background-image: url(images/wp2516773-lost-in-space-hd-wallpapers.jpg); background-size: cover; height: 800px;\">\n");
      out.write("                       \n");
      out.write("<!--                    <img src=\"images/wp1851143-the-conjuring-wallpapers.jpg\" width=\"100%\" height=\"700px\" alt=\"\"/>-->\n");
      out.write("                             <div class=\"centered\">\n");
      out.write("                                 <div class=\"car-title\"><a href=\"details.jsp?original_title=Interstellar\"><span>INTERSTELLAR</span></a></div>\n");
      out.write("                                     <span class=\"car-year\">2004</span><div class=\"circle\"></div> <span class=\"car-year\">ACTION, ADVENTURE </span>\n");
      out.write("                                     <span class=\"car-subtitle\"></span>\n");
      out.write("                                     <span class=\"car-description\">In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole.</span>\n");
      out.write("                \n");
      out.write("                              </div>\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<!--           //carousel-->\n");
      out.write("\n");
      out.write("<!--          carsusel end-->\n");
      out.write("<div class=\"containerMain\" style=\"width: 100%;\">\n");
      out.write("    <div class=\"contentMain\" style=\"margin-left: 100px; margin-right: 100px;\">\n");
      out.write("        <section class=\"popular\">\n");
      out.write("            <div style=\"width: 100%; display: block; height: 50px; margin-bottom: 30px;\">\n");
      out.write("            <span class=\"view\">Most Popular</span>\n");
      out.write("            <span class=\"show\">Showing 10 of 40</span>\n");
      out.write("    </div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-lg-12\">\n");
      out.write("        <div class=\"slider\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(1);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(2);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img  src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(3);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(4);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(5);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(6);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(7);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(8);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(9);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs.absolute(10);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>                \n");
      out.write("                \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                 </section>\n");
      out.write("                                <!--rated high section-->\n");
      out.write("                <section class=\"rated\">\n");
      out.write("        <div style=\"width: 100%; display: block; height: 50px; margin-bottom: 30px;\">\n");
      out.write("            <span class=\"view\">Top Rated</span>\n");
      out.write("            \n");
      out.write("            <span class=\"show\">Showing 10 of 40</span>\n");
      out.write("    </div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-lg-12\">\n");
      out.write("        <div class=\"slider\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(1);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(2);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(3);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(4);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(5);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(6);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(7);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(8);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(9);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">");
rs1.absolute(10);
      out.write("\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs1.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs1.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs1.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>                \n");
      out.write("                \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</div>                   \n");
      out.write("                </section>\n");
      out.write("                <!--recommendation cards-->\n");

                try{
int s[]=new int[100000];
                int x=0;
        
            //fetching userId
            String sq="select * from user where email=?";
            PreparedStatement p=conn.prepareStatement(sq);
            p.setString(1, email);
           ResultSet r=p.executeQuery(); 
           r.absolute(1);
           int userId=r.getInt("id");
           
           
           
            String sqlx="select * from ratings where userId=? and ratings>2";
            PreparedStatement pstx=conn.prepareStatement(sqlx);
            pstx.setInt(1, userId);
           ResultSet rsx=pstx.executeQuery();
           //rs is users top rated movies

           while(rsx.next())
           {
                String sql1x="select * from ratings where movieId=? and ratings>2";
                PreparedStatement pst1x=conn.prepareStatement(sql1x);
                pst1x.setInt(1, rsx.getInt("movieId"));
                ResultSet rs1x=pst1x.executeQuery();
                //rs1 has similar users
                while(rs1x.next()){
                 
                String sql2x="select * from ratings where userId=? and ratings>=4";
                PreparedStatement pst2x=conn.prepareStatement(sql2x);
                pst2x.setInt(1, rs1x.getInt("userId"));
                ResultSet rs2x=pst2x.executeQuery();
                while(rs2x.next()){
                
                
                s[x]=rs2x.getInt("movieId");
                x++;
                
                
                
                }
                }   
           }
           for(int q=0;q<x;q++){
             //  out.print(s[q]);       
           }
            //finding how many times a movie is repeated and arranging in descending order
                        
	
                   int data[]= new int[100000];
                   int repeat[]=new int[100000];
	int i,j,temp,n,count=1,k=0,d=0;
	n=x;
	//n is no. of movies in array s
	
	for (i = 0 ; i < n - 1; i++)
  	{
    	for (j = 0 ; j < n - i - 1; j++)
    	{
	      if (s[j] > s[j+1])
	      {
	        temp = s[j];
	        s[j] = s[j+1];
	        s[j+1] = temp;
	      }
	    }
  	}
	for(i=0;i<n;i++)
	{
	    for(j=i+1;j<n;j++)
	    {
	    	if(s[j]==0||s[i]==0)
	    	{
                                                break;
                                        }
			
	        if(s[i]==s[j])
	        {
	            count=count+1;
	            s[j]=0;
	        }
	        
	        if(j==n-1)
	        {
	            data[d]=s[i];
                                        d++;
		  repeat[k]=count; 
		  k++;	
		  count=1;
                            }
	    }
	}
	//sorting
	for (i = 0 ; i < k - 1; i++)
  	{
    	for (j = 0 ; j < k - i - 1; j++)
    	{
	      if (repeat[j] < repeat[j+1])
	      {
	        temp = repeat[j];
	        repeat[j] = repeat[j+1];
	        repeat[j+1] = temp;
	        
	        temp = data[j];
	        data[j] = data[j+1];
	        data[j+1] = temp;
	      }
	    }
  	}
  	for (i=0;i<10;i++)
  	{
                            out.print("\t"+data[i]);
	}
	//out.print("\n");
  	//for (i = 0 ; i < 10; i++)
  	//{
                    //        out.print("\t"+repeat[i]);
	//} 
            //end sorting
            int ii=0;
            int jj=1;    
               String sql4x="select * from moviesmetadata where id=? or id=? or id=? or id=? or id=? or id=? or id=? or id=? or id=? or id=? and id NOT IN (select movieId from ratings where userId=?)";
                PreparedStatement pst4x=conn.prepareStatement(sql4x);
                while(jj!=11){
                pst4x.setInt(jj,data[ii]);
                ii++;
                jj++;
                }
                pst4x.setInt(11,userId);
                ResultSet rs4x=pst4x.executeQuery();
                
                
           
        

      out.write("                \n");
      out.write("  <section class=\"recommendations\">\n");
      out.write("     <div style=\"width: 100%; display: block; height: 50px; margin-bottom: 30px;\">\n");
      out.write("            <span class=\"view\">Recommendations</span>\n");
      out.write("            \n");
      out.write("            <span class=\"show\">Showing 10 of 10</span>\n");
      out.write("    </div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-lg-12\">\n");
      out.write("        <div class=\"slider\">\n");
      out.write("            ");

            while(rs4x.next()){
            
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs4x.getString("original_title"));
      out.write("\"><img width=\"250px\" src=\"https://image.tmdb.org/t/p/w300");
      out.print(rs4x.getString("poster_path"));
      out.write("\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"details.jsp?original_title=");
      out.print(rs4x.getString("original_title"));
      out.write("\"><span class=\"card-title\">");
      out.print(rs4x.getString("original_title"));
      out.write("</span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

            }
            
            }catch(Exception e){
            out.print(e);}
            
      out.write("  \n");
      out.write("                \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</div>                   \n");
      out.write("                </section>                \n");
      out.write("<!--recommendation cards end--> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("              \n");
      out.write("<!--end div slider-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.3.1.min.js\"\n");
      out.write("  integrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/slick.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("$('.slider').slick({\n");
      out.write("  slidesToShow: 5,\n");
      out.write("  slidesToScroll: 1,\n");
      out.write("  autoplay: true,\n");
      out.write("  autoplaySpeed: 3000,\n");
      out.write("  dots:false,\n");
      out.write("  arrows:true,\n");
      out.write("\n");
      out.write(" \n");
      out.write("});\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/slickCustom1.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");

}
else{

      out.write("\n");
      out.write("<script>window.location='login/index.html';</script>\n");

}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
