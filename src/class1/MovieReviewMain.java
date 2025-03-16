package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "미키17";
        movieReview1.review = "봉준호 감독의 작품 복제인간에 관한 이야기";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title ="퇴마록";
        movieReview2.review = "오컬트 장르";

        System.out.println("영화 제목 : " + movieReview1.title +" , 리뷰 내용 : " + movieReview1.review);
        System.out.println("영화 제목 : " + movieReview2.title +" , 리뷰 내용 : " + movieReview2.review);
    }
}
