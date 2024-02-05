import com.alibaba.dubbo.config.DubboShutdownHook;
public class FunctionUse1688 {
public void funcUse() {
DubboShutdownHook dubboshutdownhook = new DubboShutdownHook();
dubboshutdownhook.destroyAll();
}
}