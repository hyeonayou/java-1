package class1;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview[] movieReview = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "미키17";
        movieReview1.review = "봉준호 감독의 작품 복제인간에 관한 이야기";
        movieReview[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title ="퇴마록";
        movieReview2.review = "오컬트 장르";
        movieReview[1] = movieReview2;

        for(MovieReview movieReviews : movieReview)
        {
            System.out.println("영화 제목: " + movieReviews.title + ", 리뷰: " + movieReviews.review);
        }
    }
}
