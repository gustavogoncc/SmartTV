package SistemaSmartTV;

public class Usuario {
	public static void main(String[]args) {
		SmartTv SmartTV = new SmartTv();
		
		SmartTV.diminuirVolume();
		SmartTV.diminuirVolume();
		SmartTV.diminuirVolume();
		SmartTV.aumentarVolume();
		
		System.out.println("Canal atual: "+SmartTV.canal);
		SmartTV.mudarCanal(13);
		
		System.out.println("Tv ligada ? "+SmartTV.ligada);
		System.out.println("Canal atual: "+SmartTV.canal);
		System.out.println("Volume atual: "+SmartTV.volume);
		
		SmartTV.ligar();
		System.out.println("Novo status -> Tv ligada? "+ SmartTV.ligada);
		
		SmartTV.desligar();
		System.out.println("Novo status -> Tv ligada?"+SmartTV.ligada );
		
		
		
		
		
		
		
	}

}
