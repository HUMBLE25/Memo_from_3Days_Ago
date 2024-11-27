package common;

import javax.swing.*;

// SceneData: 각 장면에 필요한 데이터를 저장하는 클래스
public class SceneData {
    private String profileName; // 프로필 이름 (장면에 표시되는 캐릭터 이름)
    private ImageIcon profileImage; // 프로필 이미지 (캐릭터 초상화)
    private String dialogue; // 대화 텍스트 (장면에 표시되는 대사)
    private ImageIcon characterImage; // 캐릭터 이미지 (장면에 등장하는 캐릭터의 전체 이미지)
    private ImageIcon backgroundImage; // 배경 이미지 (장면의 배경을 표현하는 이미지)

    // 생성자: SceneData 객체 초기화
    public SceneData(String profileName, ImageIcon profileImage, String dialogue,
                     ImageIcon characterImage, ImageIcon backgroundImage) {
        this.profileName = profileName;
        this.profileImage = profileImage;
        this.dialogue = dialogue;
        this.characterImage = characterImage;
        this.backgroundImage = backgroundImage;
    }

    // Getter 메서드: 각 필드 값 반환
    public String getProfileName() {
        return profileName;
    }

    public ImageIcon getProfileImage() {
        return profileImage;
    }

    public String getDialogue() {
        return dialogue;
    }

    public ImageIcon getCharacterImage() {return characterImage;}

    public ImageIcon getBackgroundImage() {
        return backgroundImage;
    }
}
