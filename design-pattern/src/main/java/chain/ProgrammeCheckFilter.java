package chain;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProgrammeCheckFilter implements Filter {

    private static final Log LOGGER = LogFactory.getLog(ProgrammeCheckFilter.class);

    public boolean postprocess(Context context, Exception exception) {
        LOGGER.warn("Sorry,programme is not ended up,has to redo it.");

        return CONTINUE_PROCESSING;
    }

    public boolean execute(Context context) throws Exception {
        LOGGER.warn("Boss starts to re-check.");

        return true;
    }


}
