import os

def print_directory_structure(start_path='.'):
    # 제외할 디렉터리 목록
    exclude_dirs = {'node_modules', '.next', '.git'}

    # 루트 디렉토리 이름 출력
    root_name = os.path.basename(os.path.abspath(start_path))
    print(f"|-- {root_name}/")

    for root, dirs, files in os.walk(start_path):
        # 제외할 디렉터리가 있을 경우 건너뜀
        if any(excluded in root.split(os.sep) for excluded in exclude_dirs):
            continue

        # 현재 디렉터리의 깊이를 계산하여 들여쓰기 설정
        level = root.replace(start_path, '').count(os.sep)
        indent = ' ' * 4 * (level + 1)  # 루트 디렉토리 이후는 한 칸 더 들여쓰기
        print(f"{indent}|-- {os.path.basename(root)}/")

        # 현재 디렉터리의 하위 폴더 중 제외할 디렉터리 제거
        dirs[:] = [d for d in dirs if d not in exclude_dirs]

        # 파일들에 대해 들여쓰기와 함께 출력
        sub_indent = ' ' * 4 * (level + 2)
        for file in files:
            print(f"{sub_indent}|-- {file}")

if __name__ == "__main__":
    print("Project Directory Structure:")
    print_directory_structure()
