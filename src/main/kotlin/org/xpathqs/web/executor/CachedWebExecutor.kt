package org.xpathqs.web.executor

import org.xpathqs.driver.executor.Decorator

open class CachedWebExecutor(
    origin: Decorator
) : Decorator(origin)