package chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DeveloperCommand implements Command {

    private static final Log LOGGER = LogFactory.getLog(DeveloperCommand.class);

    public boolean execute(Context context) throws Exception {
        LOGGER.info("Developer starts to develop the story.");

        return CONTINUE_PROCESSING;
    }
}
