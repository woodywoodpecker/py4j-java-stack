package chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BACommand implements Command {

    private static final Log LOGGER = LogFactory.getLog(BACommand.class);

    public boolean execute(Context context) throws Exception {
        LOGGER.info("BA starts to analysis the requirement.");

        return CONTINUE_PROCESSING;
    }

}
