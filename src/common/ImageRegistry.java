package common;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ImageRegistry {
    private static final Map<String, ImageIcon> imageCache = new HashMap<>();

    static {
        // Opening
        // Stage1
        // Stage2
        // Stage3
        // Stage4
        // Ending

        // Characters
        imageCache.put("character_프_지훈", loadImage("images/characters/프_지훈.png"));
        imageCache.put("character_천지호_앞", loadImage("images/characters/천지호_앞.png"));
        imageCache.put("character_도진", loadImage("images/characters/도진.png"));
        imageCache.put("character_전명호_앞", loadImage("images/characters/전명호_앞.png"));
        imageCache.put("character_성민", loadImage("images/characters/성민.png"));
        // 추가적으로 필요한 이미지도 등록
    }

    private static ImageIcon loadImage(String path) {
        return new ImageIcon(path);
    }

    public static ImageIcon getImage(String key) {
        return imageCache.getOrDefault(key, null);
    }
}
