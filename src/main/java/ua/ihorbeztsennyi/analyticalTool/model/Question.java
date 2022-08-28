package ua.ihorbeztsennyi.analyticalTool.model;

public class Question {
    private Integer questionId;
    private Integer categoryId;
    private Integer subcategoryId;

    public Question(Integer questionId, Integer categoryId, Integer subcategoryId) {
        this.questionId = questionId;
        this.categoryId = categoryId;
        this.subcategoryId = subcategoryId;
    }

    public Question(Integer questionId, Integer categoryId) {
        this.questionId = questionId;
        this.categoryId = categoryId;
    }

    public Question(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Integer getSubcategoryId() {
        return subcategoryId;
    }
}
