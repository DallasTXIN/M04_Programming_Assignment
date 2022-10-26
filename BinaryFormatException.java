/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dallas Lawson
 */
import java.util.Scanner;
public class TestBin2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary: ");
		try {
			System.out.println(Exercise_12_07.bin2Dec(input.nextLine()));
		}
		catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

public class BinaryFormatException extends NumberFormatException {
	private String binaryString;
	public BinaryFormatException(String binaryString) {
		super(binaryString + " is not a binary string");
		this.binaryString = binaryString;
	}
	public String getBinaryString() {
		return binaryString;
	}
}

public class BinaryFormatException extends NumberFormatException {
	private String binaryString;
	public BinaryFormatException(String binaryString) {
		super(binaryString + " is not a binary string");
		this.binaryString = binaryString;
	}
	public String getBinaryString() {
		return binaryString;
	}
}