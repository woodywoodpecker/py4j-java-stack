package chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class QACommand implements Command {

    private static final Log LOGGER = LogFactory.getLog(QACommand.class);

    public boolean execute(Context context) throws Exception {

        LOGGER.info("QA starts to test cases.");

        return CONTINUE_PROCESSING;
    }
}
