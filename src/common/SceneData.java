package common;

import javax.swing.*;

/**
 * SceneData: 하나의 장면(Scene)에서 사용되는 데이터 객체를 나타내는 클래스.
 * 각 장면에 필요한 캐릭터, 대화, 배경 이미지 등의 데이터를 포함합니다.
 *
 * Builder 패턴을 적용하여 선택적인 데이터 초기화를 지원하며,
 * 협업 시 가독성과 유지보수를 용이하게 합니다.
 */
public class SceneData {
    // 장면에 표시되는 캐릭터의 이름
    private String profileName;

    // 장면에 표시되는 캐릭터의 프로필 이미지
    private ImageIcon profileImage;

    // 장면에 표시되는 대화 텍스트
    private String dialogue;

    // 장면에 표시되는 캐릭터의 전체 이미지
    private ImageIcon mainCharacterImage;

    // 장면에 표시되는 캐릭터의 전체 이미지
    private ImageIcon subCharacterImage;

    // 장면의 배경 이미지
    private ImageIcon backgroundImage;

    /**
     * private 생성자: Builder를 통해서만 객체를 생성할 수 있도록 설정.
     * @param builder SceneData.Builder 객체를 사용해 SceneData를 생성.
     */
    private SceneData(Builder builder) {
        this.profileName = builder.profileName;
        this.profileImage = builder.profileImage;
        this.dialogue = builder.dialogue;
        this.mainCharacterImage = builder.mainCharacterImage;
        this.subCharacterImage = builder.subCharacterImage;
        this.backgroundImage = builder.backgroundImage;
    }

    /**
     * Getter 메서드: SceneData의 각 필드 값을 반환.
     * Getter는 데이터를 외부에서 읽기 전용으로 접근할 때 사용합니다.
     */

    // 캐릭터 이름을 반환합니다.
    public String getProfileName() {
        return profileName;
    }

    // 캐릭터의 프로필 이미지를 반환합니다.
    public ImageIcon getProfileImage() {
        return profileImage;
    }

    // 대화 텍스트를 반환합니다.
    public String getDialogue() {
        return dialogue;
    }

    // 캐릭터의 전체 이미지를 반환합니다.
    public ImageIcon getMainCharacterImage() {
        return mainCharacterImage;
    }

    public ImageIcon getSubCharacterImage() {
        return subCharacterImage;
    }

    // 배경 이미지를 반환합니다.
    public ImageIcon getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Builder 클래스: SceneData 객체를 생성하기 위한 내부 정적 클래스.
     * 필수 데이터와 선택적 데이터를 구분하지 않고, 필요한 데이터만 설정할 수 있습니다.
     */
    public static class Builder {
        // 초기값은 모두 null로 설정되어 있으며, 필요 시 개별적으로 설정.
        private String profileName = null;
        private ImageIcon profileImage = null;
        private String dialogue = null;
        private ImageIcon mainCharacterImage = null;
        private ImageIcon subCharacterImage = null;
        private ImageIcon backgroundImage = null;

        /**
         * profileName 설정 메서드.
         * @param profileName 캐릭터의 이름.
         * @return Builder 객체 자신을 반환하여 메서드 체이닝을 지원.
         */
        public Builder setProfileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        /**
         * profileImage 설정 메서드.
         * @param profileImage 캐릭터의 프로필 이미지 (ImageIcon).
         * @return Builder 객체 자신을 반환하여 메서드 체이닝을 지원.
         */
        public Builder setProfileImage(ImageIcon profileImage) {
            this.profileImage = profileImage;
            return this;
        }

        /**
         * dialogue 설정 메서드.
         * @param dialogue 장면에 표시되는 대화 텍스트.
         * @return Builder 객체 자신을 반환하여 메서드 체이닝을 지원.
         */
        public Builder setDialogue(String dialogue) {
            this.dialogue = dialogue;
            return this;
        }

        /**
         * mainCharacterImage 설정 메서드.
         * @param mainCharacterImage 캐릭터의 전체 이미지 (ImageIcon).
         * @return Builder 객체 자신을 반환하여 메서드 체이닝을 지원.
         */
        public Builder setMainCharacterImage(ImageIcon mainCharacterImage) {
            this.mainCharacterImage = mainCharacterImage;
            return this;
        }

        /**
         * subCharacterImage 설정 메서드.
         * @param subCharacterImage 캐릭터의 전체 이미지 (ImageIcon).
         * @return Builder 객체 자신을 반환하여 메서드 체이닝을 지원.
         */
        public Builder subCharacterImage(ImageIcon subCharacterImage) {
            this.subCharacterImage = subCharacterImage;
            return this;
        }
        /**
         * backgroundImage 설정 메서드.
         * @param backgroundImage 장면의 배경 이미지 (ImageIcon).
         * @return Builder 객체 자신을 반환하여 메서드 체이닝을 지원.
         */
        public Builder setBackgroundImage(ImageIcon backgroundImage) {
            this.backgroundImage = backgroundImage;
            return this;
        }

        /**
         * build 메서드: SceneData 객체를 생성하여 반환.
         * @return 생성된 SceneData 객체.
         */
        public SceneData build() {
            return new SceneData(this);
        }
    }
}
