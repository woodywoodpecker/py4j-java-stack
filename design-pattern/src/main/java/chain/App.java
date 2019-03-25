package chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.config.ConfigParser;
import org.apache.commons.chain.impl.CatalogFactoryBase;
import org.apache.commons.chain.impl.ContextBase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.chain.Catalog;

public class App {

    private static final String CONFIG_FILE = "commons-chain-config.xml";

    private static final Log logger = LogFactory.getLog(App.class);

    private ConfigParser parser;

    private Catalog catalog;

    public App() throws Exception {
        this.parser = new ConfigParser();
        this.parser.parse(this.getClass().getClassLoader().getResource(CONFIG_FILE));
        this.catalog = CatalogFactoryBase.getInstance().getCatalog("auto-programme");
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        Command command = app.catalog.getCommand("team-build");
        Context ctx = new ContextBase();
        command.execute(ctx);

        Command filter = app.catalog.getCommand("re-check");
        filter.execute(ctx);
    }

}
