package ua.ihorbeztsennyi.analyticalTool.model;

public enum Response {
    FIRST('P'),
    NEXT('N');

    private final Character responseType;

    Response(Character character) {
        this.responseType = character;
    }
}
