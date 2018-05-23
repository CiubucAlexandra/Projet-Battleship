package fr.battleship;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestIA {

	public static void main(String[] args)throws FileNotFoundException {

	int score1 = 0;
	int score2 = 0;
	int score3 = 0;
	int score4 = 0;
	int score5 = 0;
	int score6 = 0;
	
		for(int i=0; i<50; i++) {
		AI1vsAI0 game1 = new  AI1vsAI0();
		AI0vsAI1 game2 = new AI0vsAI1();
		
		 
		 int a1= game1.createGame();
		 if(a1==1 ) {
			 score1++;
		 }else if(a1==2 ){
			 score2++;
		 }
		 int a2= game2.createGame();//
		 if(a2==2) {
			 score1++;
		 }else if(a2==1){
			 score2++;
		 }
		
		 
		}
		
		
		//1 v2
		
		for(int i=0; i<50; i++) {
			AI1vsAI2 game1 = new  AI1vsAI2();
			AI2vsAI1 game2 = new AI2vsAI1();
			
			 
			 int a1= game1.createGame();
			 if(a1==1 ) {
				 score3++;
			 }else if(a1==2 ){
				 score4++;
			 }
			 int a2= game2.createGame();//
			 if(a2==2) {
				 score3++;
			 }else if(a2==1){
				 score4++;
			 }
			
			 
			}
				
	
		for(int i=0; i<50; i++) {
			AI0vsAI2 game1 = new  AI0vsAI2();
			AI2vsAI0 game2 = new AI2vsAI0();
			
			 
			 int a1= game1.createGame();
			 if(a1==1 ) {
				 score5++;
			 }else if(a1==2 ){
				 score6++;
			 }
			 int a2= game2.createGame();//
			 if(a2==2) {
				 score5++;
			 }else if(a2==1){
				 score6++;
			 }
			
			 
			}
			System.out.println("AIV0 vs AIV1:");
			System.out.println("Le score pour AIV0 " + score2);
			System.out.println("Le score pour AIV1 " + score1);
			System.out.println("AIV0 vs AIV2:");
			System.out.println("Le score pour AIV0 " + score5);
			System.out.println("Le score pour AIV2 " + score6);
			System.out.println("AIV1 vs AIV2:");
			System.out.println("Le score pour AIV1 " + score3);
			System.out.println("Le score pour AIV2 " + score4);
			
			 PrintWriter pw = new PrintWriter(new File("ai_proof.csv"));
		        StringBuilder sb = new StringBuilder();
		        sb.append("");
		        sb.append(',');
		        sb.append("");
		        sb.append(System.lineSeparator());

		        sb.append("AI Name");
		        sb.append(',');
		        sb.append("Score");
		        sb.append(',');
		        sb.append("AI Name2");
		        sb.append(',');
		        sb.append("Score2");
		        sb.append(System.lineSeparator());
		        
		        sb.append("AI Level Beginner");
		        sb.append(',');
		        sb.append(score2);
		        sb.append(',');
		        sb.append("AI Level Medium");
		        sb.append(',');
		        sb.append(score1);
		        sb.append(System.lineSeparator());
		        
		        sb.append("AI Level Beginner");
		        sb.append(',');
		        sb.append(score5);
		        sb.append(',');
		        sb.append("AI Level Hard");
		        sb.append(',');
		        sb.append(score6);
		        sb.append(System.lineSeparator());
		        
		        sb.append("AI Medium");
		        sb.append(',');
		        sb.append(score3);
		        sb.append(',');
		        sb.append("AI Level Hard");
		        sb.append(',');
		        sb.append(score4);
		        sb.append(System.lineSeparator());
		        
		        

		        pw.write(sb.toString());
		        pw.close();
		        
	}

}
