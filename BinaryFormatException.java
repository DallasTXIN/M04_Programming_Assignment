/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dallas Lawson
 */
import java.util.Scanner;
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