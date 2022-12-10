import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class Main {
    public static void main(String[] args) throws CmdLineException {
        Methods methods = new Methods();
        CmdLineParser cmd = new CmdLineParser(methods);

        cmd.parseArgument(args);

        NearestNeighbor.start();
        NearestInsertion.start();
        FarthestInsertion.start();
        CheapestInsertion.start();
        ArbitraryInsertion.start();
    }
}
