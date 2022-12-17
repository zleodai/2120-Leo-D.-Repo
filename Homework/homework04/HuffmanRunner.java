import source.HuffmanEncoder;
import source.GFG;

class HuffmanRunner {
    public static void main(String[] args){
        HuffmanEncoder tester = new HuffmanEncoder("hello testing testing/// there are 10 yyyyyyyyyy's");
        byte[] encodedMessage = tester.encode();
        String decodedMessage = tester.decode(encodedMessage);

        tester.setString("OMGOMGOMOMG NOW WAY IT WORKS FINALLAYAS hIDAIHDAIUSDHASIDS3129487yuio12");
        byte[] eencodedMessage = tester.encode();
        String ddecodedMessage = tester.decode(eencodedMessage);

        tester.setString("Creating the Huffman Tree Weve seen how to use the Huffman tree for decoding, but how do we create this tree? There are many ways to handle this problem. Well base our approach on the Node and Tree classes in the tree.java program in Listing 8.1 (although routines that are specific to search trees, like find(), insert(), and delete() are no longer relevant). Here is the algorithm for constructing the tree: 1. Make a Node object (as seen in tree.java) for each character used in the message. For our Susie example that would be nine nodes. Each node has two data items: the character and that characters frequency in the message.");
        byte[] eeencodedMessage = tester.encode();
        String dddecodedMessage = tester.decode(eeencodedMessage);
    }
}
