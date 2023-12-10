package App.BlockChain;

import java.util.ArrayList;



public class BlockChainMain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 5;

    public static void main(String[] args) {
       
        Block genesisBlock = new Block(0, "0", "Genesis Block");
        genesisBlock.mineBlock(difficulty);
        blockchain.add(genesisBlock);
        System.out.println(genesisBlock.toString());

        Block firstBlock = new Block(1, genesisBlock.currentHash, "First Block");
        firstBlock.mineBlock(difficulty);
        blockchain.add(firstBlock);
        System.out.println(firstBlock.toString());

        Block secondBlock = new Block(2, firstBlock.currentHash, "Second Block");
        secondBlock.mineBlock(difficulty);
        blockchain.add(secondBlock);
        System.out.println(secondBlock.toString());
    }
    
}
