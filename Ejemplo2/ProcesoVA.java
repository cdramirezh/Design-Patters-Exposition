
public class ProcesoVA {
	
	private ProcesoVAData datos;
	
	public ProcesoVA(String captura, String preprocesamiento, String segmentacion, String extractCarac, String recognPattern) 
	{
		datos = new ProcesoVAData(captura, preprocesamiento, segmentacion, extractCarac, recognPattern);
	}
	
	public void tomarFotos(String imagenes) {
		this.datos.setCaptura(imagenes);
	}
	
	public String preprocesar() {
		return this.datos.getCaptura()+"filtro";
	}
	
}
