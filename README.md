# dasom Project

## 📌프로젝트 개요
1. 웹 사이트 명 : 다솜아띠

2. 프로젝트 주제 : 재난 후원 모금 및 자원봉사자 모집

3. 기획 배경 : 
      최근 자연 재해로 지역 주민들이 피해를 크게 입는 일들이 언론에 많이 보도 되었습니다.
      이러한 재해, 재난의 피해 복구를 위해 피해 주민들에게 많은 도움의 손길을 내밀고 싶어 하는 개인 후원자, 
      봉사자들이 많습니다. 하지만 이러한 재해, 재난의 피해를 입은 피해 주민들에게 개인이 도움의 손길을 
      내밀 수 있는 공간이 부족합니다.
      따라서, 피해 주민들을 위해 재난/재해 피해 현장을 전달하고 개인 후원/봉사자들이 도움을 전할 수 있는 사이트를
      만들고, 더 나아가 본인에게도 일어날 수 있는 자연재해와 재난이기에 미리 예방하고 대응할 수 있도록 
      후원/봉사자들의 주소를 기반으로 대피소의 위치를 제공할 수 있는 프로젝트를 구상하였습니다.

4. 제공 서비스 : 
      1) 재해 재난 피해 내용을 확인 할 수 있는 플랫폼
      2) 피해 지역 주민들을 위한 봉사 활동 신청이 가능하다
      3) 피해 지역 주민들을 위한 후원 활동이 가능하다
      4) 본인 위치에서 가까운 대피소에 위치 정보를 얻을 수 있다

5. 기대효과 : 
      1) 사용자가 최근 일어난 재해/재난을 플랫폼을 통해 확인할 수 있으며 개인 봉사와 후원을 통해 공익적으로 긍정적인 효과를 불러온다
      2) 재해 /재난에 대한 경각심을 가질 수 있으며 대피소의 위치 제공을 통해 사전 대응 효과를 기대할 수 있다.



## 📌git 진행순서

폴더명 : da
하위 폴더명(퍼블리싱 폴더) : publishing
--------------------------------------------------------------------------------------------------

▶ 클론 딸 때

1. git config --list(본인 계정이 맞는지 확인)

2. git clone https://github.com/spring-dasom/dasom.git .

3. git remote -v

4. git remote rm origin

5. git remote add origin 개인 서버 URL
   git remote add dasom https://github.com/spring-dasom/dasom.git
	※ 개인 서버명 : origin / 공용 서버명 : da

5) git branch 개인브랜치명

---------------------------------------------------------------------------------------------------

▶ 내가 수정하고 pr 올릴 때

1. 개인 브랜치 체크아웃 상태에서 수정하고
   git add 수정한 파일 경로
	ex) 자유게시판 전체 폴더 수정 시 : git add 수정한 파일 폴더명

   git commit -m "상세 내용 작성"

2. main 체크아웃 상태에서 
   git merge 개인브런치명

3. main 체크아웃 상태에서
   git push origin main

4. 개인 레파지토리 main브랜치에서 pull request

5. 팀장님이 pr 확인 > merge > pull 받으라고 말씀해주시면

6. main 체크아웃 상태에서
   git pull da main

7. 개인 브랜치 체크아웃 상태에서
   git merge main

------------------------------------------------------------------------------------------------

▶ 다른 사람이 수정한 파일 pr&merge 후에 풀 받을 때

1. main 체크 아웃 상태에서 
   git pull da main

2. 개인 브랜치 체크아웃 상태에서
   git merge main
	※ 개인 브랜치에서 작업하던게 완료되지 않은 상태이면 merge 하지 않기!!!!!!!!!!!!
	  작업이 완료 되지 않은 상태이면 main 체크 아웃 상태에서 pull만 받아주세요!!!!!!!!

-------------------------------------------------------------------------------------------------

▶ 파일 commit , pr 올릴 때 작성 예시

ex)  "본인 이름  날짜  시간  수정 내용"



## 📌퍼블리싱 역할 분배

1. 강진혁 : 메인페이지, 헤더, 푸터, 대피소 페이지, 회원가입, 마이페이지
2. 나예은 : 관리자페이지, 로그인 페이지, 아이디/비밀번호 찾기
3. 박승권 : 후원페이지, 봉사페이지
4. 이우진 : 관리자페이지, 로그인 페이지, 아이디/비밀번호 찾기


## 📌 백작업 역할 분배

1. 강진혁 : 관리자 페이지(회원관리, 후원 내역 관리, 후원 캠페인 관리, 봉사 캠페인 관리), 메인페이지, 대피소 페이지(카카오맵 api)
2. 나예은 : 회원가입, 로그인, 아이디 저장, 후원 결제(카카오 결제 api)
3. 박승권 : 후원 캠페인 리스트, 봉사 캠페인 리스트, 봉사 참여 신청 기능
4. 이우진 : 아이디 및 비밀번호 찾기, 마이 페이지(나의 후원 내역, 나의 봉사 참여, 회원 정보 수정)
