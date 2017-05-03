/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.util.Date;

/**
 *
 * @author sena
 */
public class Eventos {

   private String nombreEvento;
   private String tipoEvento;
   private String noticias;
   private String articulos;
   private String publicaciones;
   private  Date fechaEvento;
   
   
   public void setNombreEvento(String nombreEvento)
   {
    this.nombreEvento=nombreEvento;   
   }
    public String getNombreEvento()
    {
        return nombreEvento;
    }         
    

public void setTipoEvento(String tipoEvento)
{
    this.tipoEvento=tipoEvento;
}

public String getTipoEvento()
{
    return tipoEvento;
}


public void setNoticias(String noticias)
{
    this.noticias=noticias;
}
public String getNoticias()
{
    return noticias;
}


public void setArticulos(String articulos)
{
    this.articulos=articulos;
}
public String getArticulos()
{
    return articulos;
}

public void setPublicaciones(String publicaciones)
{
    this.publicaciones=publicaciones;
}
public String getPublicaciones()
{
    return publicaciones;
}

public void setFechaEvento(Date fechaEvento)
{
    this.fechaEvento=fechaEvento;
}

}

