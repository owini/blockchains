public class Blockchain {

	public static void main(String[] args) {
		
		Block genesisBlock = new Block("First Block", "0");
		System.out.println("Hash for Block 1: " + genesisBlock.hash);
		
		Block secondBlock = new Block("Second Block",genesisBlock.hash);
		System.out.println("Hash for Block 2 : " + secondBlock.hash);
		
		Block thirdBlock = new Block("Third block",secondBlock.hash);
		System.out.println("Hash for Block 3 : " + thirdBlock.hash);
		
	}
}
