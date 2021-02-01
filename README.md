# Algorithm-Study

SSAFY 과제와 선정한 알고리즘 문제를 풀고, 풀이 방법을 공유합니다.

현재는 온라인 `Zoom`, `Google Meet` 으로 진행합니다!  
오프라인 변동시, 일정을 다시 조율합니다!  

[스터디 노션](https://www.notion.so/874b18b59d054fdab98e6ea58a7fb3f2)

## :straight_ruler: Rule

- 세션 당 휴식시간 10분을 원칙으로 하며, 아래의 순서대로 진행됩니다!
- 캠`ON` (회의, 브리핑, 코드리뷰, 브레이크타임엔 마이크 전원 ON)

1️⃣ **SSAFY 과제, 워크샵ㄷ

매일 주어지는 과제 & 워크샵을 풀어갑니다.  
세션 시작 전에 시간을 정하고, 각자 해결합니다.  
`중간점검`을 통해 각자의 진행도를 `브리핑`하고 많이 뒤쳐진 스터디원이 있다면 모두가 적극적으로 도와줍니다.

2️⃣ **알고리즘**

[스터디 일지](https://www.notion.so/01d37403527e4f30afbb9070dd386a3b?v=fcf14b4141864fc3ac459a7da26baded)  참고하여 해당 요일의 `당번(로테이션)`은 알고리즘 문제를 준비해 옵니다. (백준, 프로그래머스 등)  

[백준 그룹](https://www.acmicpc.net/group/10127) 에 문제를 업로드합니다.

정해진 시간이 종료되면,  

✔ 문제를 준비한 사람  
✔ 소스코드 길이, 시간, 제출 시간 등을 고려해 뽑힌 사람  
✔ 추천 또는 랜덤하게 선발된 사람  
✔ 자발적으로 발표할 사람  

조건에 부합되는 스터디원이 자신의 코드를 리뷰하고 질의응답을 받습니다.

3️⃣ **개인공부**

알고리즘 세션 이후엔 자유롭게 공부합니다.

4️⃣ **회고**

좋았던 점과 아쉬웠던 점, 개선할 점 등 서로의 감정을 공유합니다.

##  :white_check_mark: How To Use Git?

###  디렉토리 설정(한 번만)

- 저는 [Git bash](https://git-scm.com/downloads) 사용자입니다. 개발자는 터미널을 사랑해야 하지 않을까요? 함께 익숙해져 봅시다.
- git bash + windows 10 + eclipse 기준으로 설명합니다. workspace 설정부터 시작합니다.

1. 위 링크에서 Git Bash 를 설치하고, File - Switch Workspace - Other... 에서 본인이 원하는 디렉토리에 workspace 설정해줍시다.

2. Project Explorer 우클릭 - New - Project - Java Project 로 프로젝트 생성합니다. 저는 이름을 ssafy-study 로 했습니다.

   ![image-20210201233809538](C:\Users\sim\AppData\Roaming\Typora\typora-user-images\image-20210201233809538.png)

   (어쩌다보니 저따구로 만들어졌네요..)

3. 생성된 프로젝트 아이콘을 우클릭 - Show in - System Explorer 로 파일 탐색기를 엽니다.

4. **src폴더 내에서** (중요)  우클릭 - Git bash here 로 git bash 를 켜줍니다. 

5. Git bash 에서 git init 입력합니다.

6. ```bash
   # 입력 
   $ git init
   # 결과
   Initialized empty Git repository in C:/Users/sim/Desktop/Study/ssafy-study/.git/
   ```

7. ```bash
   # 입력 
   $ git remote add origin https://github.com/SSAFY-SEOUL11/algorithm-study-seoul11.git
   $ git remote -v
   # 결과
   origin  https://github.com/SSAFY-SEOUL11/algorithm-study-seoul11.git (fetch)
   origin  https://github.com/SSAFY-SEOUL11/algorithm-study-seoul11.git (push)
   ```

8. ```bash
   # 입력
   $ git pull origin master # 꼭 필요한 과정은 아닙니다. 어차피 master에는 README.md만 있기 때문입니다.
   # 결과
   remote: Enumerating objects: 3, done.
   remote: Counting objects: 100% (3/3), done.
   remote: Compressing objects: 100% (2/2), done.
   remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0
   Unpacking objects: 100% (3/3), done.
   From https://github.com/SSAFY-SEOUL11/algorithm-study-seoul11
    * branch            master     -> FETCH_HEAD
    * [new branch]      master     -> origin/master
   ```

9. `git pull origin master `를 입력하고 나면, ssafy-study 디렉토리에 README.md 가 생깁니다. 앞으로도 `master`에는 `README.md` 파일만 있을 것이고, 각자의 코드는 각자의 branch 에 넣습니다.

10. 이제 컨벤션을 잘 지킨 채 코딩을 열심히 했다는 가정 하에, 다음과 같이 파일들이 생겼습니다.![image-20210201233330921](C:\Users\sim\AppData\Roaming\Typora\typora-user-images\image-20210201233330921.png)

11. 이제 다시 `ssafy-study` 폴더를 열고, git bash 를 다시 엽니다.

12. ```bash
    $ git branch simju1001-심정욱 # 백준아이디-이름 으로 브랜치 이름 규격을 정했습니다.
    $ git branch -v
     * master           f81b02e docs : README # 현재 master 에 초록색으로 체크되어 있습니다.
      simju1001-심정욱 f81b02e docs : README
    $ git checkout simju1001-심정욱 # 특정 브랜치로 이동하는 명령어입니다.
    Switched to branch 'simju1001-심정욱'
    $ git branch -v
      master           f81b02e docs : README
    * simju1001-심정욱 f81b02e docs : README # 이제 simju1001-심정욱 으로 브랜치가 설정되었습니다.
    ```

13. 여기 까지가 환경 설정 및 브랜치 설정이었습니다. 아래부터는 코드가 생길 때 마다 저장소에 올리는 과정, add-commit-push 과정입니다.

### 코드 올리기 : add - commit - push

1. ```bash
   $ git status # 변경된 것이 있는지 보여주는 명령입니다.
   On branch master
   Untracked files:
     (use "git add <file>..." to include in what will be committed)
   
           mon02/
   
   nothing added to commit but untracked files present (use "git add" to track)
   ```

2. ```bash
   $ git add . # .gitignore 에 등록된 파일들을 제외한 변경된 모든 파일을 추가하겠다는 의미입니다. 
   $ git status
   On branch simju1001-심정욱
   Changes to be committed:
     (use "git reset HEAD <file>..." to unstage)
   
           new file:   "mon02/day01/boj_\354\271\264\353\223\2342/boj_\354\271\264\353\223\2342_\354\213\254\354\240\225\354\232\261.java"
   ```

3. 이름이 저렇게 나오는 건 한글이라 그렇습니다. 무시하고 커밋을 합니다.

4. ```bash
   $ git commit -m "solve : 카드2 풀이 완료"
   //결과
   [simju1001-심정욱 bf28f21] solve : 카드2 풀이 완료
    1 file changed, 24 insertions(+)
    create mode 100644 "mon02/day01/boj_\354\271\264\353\223\2342/boj_\354\271\264\353\223\2342_\354\213\254\354\240\225\354\232\261.java"
   ```

5. ```bash
   $ git push origin simju1001-심정욱
   Enumerating objects: 7, done.
   Counting objects: 100% (7/7), done.
   Delta compression using up to 12 threads
   Compressing objects: 100% (4/4), done.
   Writing objects: 100% (6/6), 778 bytes | 389.00 KiB/s, done.
   Total 6 (delta 0), reused 0 (delta 0)
   remote:
   remote: Create a pull request for 'simju1001-심정욱' on GitHub by visiting:
   remote:      https://github.com/SSAFY-SEOUL11/algorithm-study-seoul11/pull/new/simju1001-%EC%8B%AC%EC%A0%95%EC%9A%B1
   remote:
   To https://github.com/SSAFY-SEOUL11/algorithm-study-seoul11.git
    * [new branch]      simju1001-심정욱 -> simju1001-심정욱
   ```

6. 이제 push 까지 완료되었으니, github repository 에 등록이 되었습니다. 

7. [우리의 repo](https://github.com/SSAFY-SEOUL11/algorithm-study-seoul11) 에 들어가서 해당 부분을 클릭하면, 다른 사람들이 추가했던 브랜치 및 자신의 브랜치가 보일 것입니다.

![image-20210202001150175](C:\Users\sim\AppData\Roaming\Typora\typora-user-images\image-20210202001150175.png)

8 전환하면, master 에는 없었던 mon02/... 이 보입니다. 제가 작업했던 코드임을 알 수 있습니다. 같은 방법으로 다른 사람의 브랜치에 들어가서 코드를 볼 수 있습니다.



## :white_check_mark: Code Convention

### 디렉토리 및 파일 생성

mon월 / day일 / 저지 사이트_문제명 / 소스명

```
mon01/day31/boj_큐/boj_큐_이한울.java
```

### 커밋 메시지 규약

```
docs: README.md 등 문서 작성 및 수정
solve: {boj, programmers 등 문제 출처} {문제 이름} 풀이 완료
fix: 코드, 에러 수정
add: 기존에 해결한 문제의 다른 솔루션 추가
```

### 작성 예시

`백준 카드2` 문제를 `이한울`이 `풀이 완료`

```
solve: boj 카드2 이한울
```