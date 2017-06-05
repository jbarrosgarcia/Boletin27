/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones;

/**
 * 
 * @author  Jose Barros
 */
public class Alumno {
    
    String nome, apelido, curso;

    public Alumno(String nome, String apelido, String curso) {
        this.nome = nome;
        this.apelido = apelido;
        this.curso = curso;
    }

    public Alumno() {
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nuevo Alumno: " + "Nome: " + nome + ", Apelido: " + apelido + ", Curso: " + curso + '.';
    }
    
    

}
