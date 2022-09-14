
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Department
		Department department = new Department();
		department.DepartmentID = 1;
		department.DepartmentName = "Sale";
		
		// Create Group
		Group group = new Group();
		group.GroupID = 1;
		group.GroupName = "Marketting";
		group.CreatorID = 1;
		group.CreatorDate = "2022-12-9";
		
		// Create position
		Position position = new Position();
		position.PositionID = 1;
		position.PositionName = "Dev";
		
		// create account
		Account account = new Account();
		account.AccountID = 1;
		account.Email = "nguyenvana@gmail.com";
		account.UserName= "nva";
		account.FullName = "Nguyễn Văn A";
		Department department = new Department();
		department.DepartmentID = 1;
		Position position = new Position();
		position.PositionID = 1;
		account.CreateDate = "2022-09-14";
		
		// create group account
		GroupAccount groupaccount = new GroupAccount();
		Group group = new Group();
		group.GroupID = 1;
		Account account = new Account();
		account.AccountID = 1;
		groupaccount.JoinDate = "2022-13-9";
		
		// Create typeQuestion
		TypeQuestion typequestion = new TypeQuestion();
		typequestion.TypeID = 1;
		typequestion.TypeName= "hài";
		
		// create categoryquestion
		CategoryQuestion categoryquestion = new CategoryQuestion();
		categoryquestion.CategoryID = 1;
		categoryquestion.CategoryName = "Java";
		
		// create Question
		Question question = new Question();
		question.QuestionID = 1;
		question.Content="hài hước";
		CategoryQuestion categoryquestion = new CategoryQuestion();
		categoryquestion.CategoryID = 1;
		TypeQuestion typequestion = new TypeQuestion();
		typequestion.TypeID = 1;
		question.CreatorID = 1;
		question.CreateDate = "2022-10-9";
		
		//create Answer
		Answer answer =  new Answer();
		answer.AnswerID = 1;
		answer.Content = "vui vẻ";
		Question question = new Question();
		question.QuestionID = 1;
		question.isCorrect = "đúng";
		
		// create exam
		Exam exam = new Exam();
		exam.ExamID = 1;
		exam.Code = "a123";
		exam.Title = "Thi cuối kì";
		CategoryQuestion categoryquestion = new CategoryQuestion();
		categoryquestion.CategoryID = 1;
		exam.CreatorID = 1;
		exam.CreateDate = "2022-9-8";
		
		//create examquestion
		ExamQuestion examquestion = new ExamQuestion();
		Exam exam = new Exam();
		exam.ExamID = 1;
		Question question = new Question();
		question.QuestionID = 1;
		
		System.out.println(department.DepartmentID);
		System.out.println(department.DepartmentName);
		System.out.println(group.GroupID);
		System.out.println(group.GroupName);
		System.out.println(group.CreatorID);
		System.out.println(group.CreatorDate);
		
	}

}
