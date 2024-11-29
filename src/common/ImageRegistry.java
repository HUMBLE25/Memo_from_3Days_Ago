package common;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ImageRegistry {
    private static final Map<String, ImageIcon> imageCache = new HashMap<>();

    static {
        // Opening
        // Stage1
        // Stage1 Intro
        imageCache.put("stage1_학교", loadImage("images/stage1/학교.png"));
        imageCache.put("stage1_사물함_1", loadImage("images/stage1/사물함_1.png"));

        // MoonSeonHa Story
        imageCache.put("stage1_문성하_사물함_0", loadImage("images/stage1/문성하_사물함/문성하_0.png"));
        imageCache.put("stage1_문성하_사물함_1", loadImage("images/stage1/문성하_사물함/문성하_1.png"));

        // JeonMyeongHo Story
        imageCache.put("stage1_전명호_사물함_0", loadImage("images/stage1/전명호_사물함/전명호_0.png"));
        imageCache.put("stage1_전명호_사물함_1", loadImage("images/stage1/전명호_사물함/전명호_1.png"));
        imageCache.put("stage1_사물함_2", loadImage("images/stage1/사물함_2.png"));

        // Stage1 Outro
        imageCache.put("stage1_옥상", loadImage("images/stage1/옥상.png"));
        imageCache.put("stage1_지도", loadImage("images/stage1/지도.png"));

        // Stage2
        // Stage3
        // Stage4
        // Ending

        // profile
        imageCache.put("character_프_지훈", loadImage("images/characters/프_지훈.png"));
        imageCache.put("character_프_지호", loadImage("images/characters/프_지호.png"));
        imageCache.put("character_프_경비", loadImage("images/characters/프_경비.png"));
        // Characters
        imageCache.put("character_천지호_오른쪽", loadImage("images/characters/천지호_오른쪽.png"));
        imageCache.put("character_폐인지호", loadImage("images/characters/폐인지호.png"));
        imageCache.put("character_경비", loadImage("images/characters/경비.png"));
        imageCache.put("character_명지훈_오른쪽", loadImage("images/characters/명지훈_오른쪽.png"));

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
