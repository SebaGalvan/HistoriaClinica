package PublicClasses;

import java.util.Date;


public class Patients {

	
	public Patients(int id, String nombre, String apellido, String telefono,int  dni, String  domicilio, 
			String  email, String  estadoCivil, String localidad, char sexo, String alergias, 
			String fechaDeNacimiento, String fechaDeAltaHistoria, String  antecedentesDeEnfermedades, 
			String antecedentesHredFamila, Boolean coberturaMedica, String intervencionesQuirurjicas, String religion) 
	  

	  //id, nombre , apellido, telefono, dni, domicilio, email, 
	  //estadoCivil, localidad, sexo, alergias, fechaDeNacimiento,
	  //fechaDeAltaHistoria, antecedentesDeEnfermedades, antecedentesHerdFamilia, 
	  //coberturaMedica,intervencionesQuirurjicas, religion
	
	
	{
		setId(id);
		setNombre(nombre);
		setApellido(apellido);
		setTelefono(telefono);
		setDni(dni);
		setDomicilio(domicilio);
		setEmail(email);
		setEstadoCivil(estadoCivil);
		setLocalidad(localidad);
		setSexo(sexo);
		setAlergias(alergias);
		setFechaDeNacimiento(fechaDeNacimiento);
		setFechaDeAltaHistoria(fechaDeAltaHistoria);
		setAntecedentesDeEnfermedades(antecedentesDeEnfermedades);
		setAntecedentesHredFamila(antecedentesHredFamila);
		setCoberturaMedica(coberturaMedica);
		setIntervencionesQuirurjicas(intervencionesQuirurjicas);		
		setReligion(religion);	
	}
	
	public void getDatos() {
		
		String datos;
		String cobertura,sexo;
		
		if(this.getSexo()=='F' || this.getSexo()=='f')sexo="Femenino"; else sexo="Masculino";
		
		if(this.getCoberturaMedica())cobertura="Tiene Cobertura"; else cobertura="No tiene cobertura medica"; 
		
		datos = " Fecha Alta Historia clinica: "+this.getFechaDeAltaHistoria()+"/n"+"Numero ID: "+this.getId()+ "/n" +" El paciente " + this.getNombre() + " " + this.getApellido() +" con telefono "+ this.getTelefono()+ " DNI: "+ this.getDni() +" domicilio "+ this.getDomicilio()+ " email: /n"+ this.getEmail() +
				" su estado civil es "+this.getEstadoCivil()+" vive en la localidad de "+ this.getLocalidad()+ " su sexo es: "+ sexo+ " tiene las siguientes alergias "+ this.getAlergias()+" su fecha de Nacimiento es: "+ this.getFechaDeNacimiento()+
				"/n "+ "  Los antecedentes de enfermedades que presenta son los siguientes:"+ this.getAntecedentesDeEnfermedades()+"/n" + "Sus antecedentes familiares son: "+"/n"+ this.getAntecedentesHredFamila()+"/n"+
				" Cobertura medica: " + cobertura + "Intervenciones Quirurjicas: "+ this.getIntervencionesQuirurjicas()+ " Religion:  "+this.getReligion() 
				;
		System.out.println(datos);
		
	
	}
	
	/*public Date getFechaDeAltaHistoria() {
		return fechaDeAltaHistoria;
	}
	public void setFechaDeAltaHistoria(Date fechaDeAltaHistoria) {
		this.fechaDeAltaHistoria = fechaDeAltaHistoria;
	}*/
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getCoberturaMedica() {
		return coberturaMedica;
	}
	public void setCoberturaMedica(Boolean coberturaMedica) {
		this.coberturaMedica = coberturaMedica;
	}
	
	
	/*public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}*/
	
	
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getAntecedentesDeEnfermedades() {
		return antecedentesDeEnfermedades;
	}
	public void setAntecedentesDeEnfermedades(String antecedentesDeEnfermedades) {
		this.antecedentesDeEnfermedades = antecedentesDeEnfermedades;
	}
	public String getAntecedentesHredFamila() {
		return antecedentesHredFamila;
	}
	public void setAntecedentesHredFamila(String antecedentesHredFamila) {
		this.antecedentesHredFamila = antecedentesHredFamila;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getIntervencionesQuirurjicas() {
		return intervencionesQuirurjicas;
	}
	public void setIntervencionesQuirurjicas(String intervencionesQuirurjicas) {
		this.intervencionesQuirurjicas = intervencionesQuirurjicas;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFechaDeAltaHistoria(String fechaDeAltaHistoria) {
		this.fechaDeAltaHistoria = fechaDeAltaHistoria;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getFechaDeAltaHistoria() {
		return fechaDeAltaHistoria;
	}



	private int id;
	//private Date fechaDeAltaHistoria;
	private String fechaDeAltaHistoria;
	private int dni;
	private String nombre; 
	private String apellido;
	private String domicilio;
	private char sexo;
	private String telefono;
	private Boolean coberturaMedica;
	//private Date fechaDeNacimiento;
	private String fechaDeNacimiento;
	private String localidad;
	private String estadoCivil;
	private String antecedentesDeEnfermedades;
	private String antecedentesHredFamila;
	private String alergias;
	private String intervencionesQuirurjicas;
	private String email;
	private String religion;
	
	

}
