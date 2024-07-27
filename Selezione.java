package com.mycompany.mavenproject4;

/* Visualizza i dati ott
enuti da un' interrogazione */
import java.sql.*;
public class Selezione
{
public static void main (String args [ ] )
{
String url = "jdbc:odbc :dbl";
Connection con;
String query = "SELECT {Chiave primaria}, Argomento, Categoria, Autore, Titolo, " + 
" Editore, Luogo,  Data" +
" FROM VittorioDATI01 " +
"ORDER BY {Chiave primaria}";
Statement stmt;
try
{
Class.forName( " sun . jdbc .odbc.IdbcOdbcDriver " );
}
catch(ClassNotFoundException e )
{
System.err.print ( "ClassNotFoundException: " );
System.err.println(e .getMessage());
}
try
{
con = DriverManager .getConnection (url," ", " ");
stmt = con.createStatement();
ResultSet rs = stmt .executeQuery (query );
while (rs.next ( ) )
{ int chiave_primaria = rs.getInt (1);
String argomento = rs.getString (2);
String categoria = rs.getString(3);
String autore = rs.getString(4);
String titolo = rs.getString(5);
String editore = rs.getString(6);
String luogo = rs.getString(7);
String data = rs.getString(8);
// visualizza icampi
System.out.println( "Chiave primaria = " + chiave_primaria);
System.out.println( "Argomento = " + argomento);
System.out.println( "Categoria = " + categoria);
System.out.println( "Autore = " + autore);
System.out.println( "Titolo = " + titolo);
System.out.println( "Editore = " + editore);
System.out.println( "Luogo = " + luogo);
System.out.println( "Data = " + data);
System.out.print( " \n");
}
stmt.close( );
con.close();
}
catch( SQLException ex )
{
System.err.print ( "SQLException: " );
System.err.println(ex.getMessage( ) );
}
}
}