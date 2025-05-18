import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class ResumeData {
    private List<JTextField> personalFields = new ArrayList<>();
    private List<JTextField> contactFields = new ArrayList<>();
    private JTextArea objectiveArea;
    private JTextArea experienceArea;
    private JTextArea skillsArea;
    private JTextField collegeNameField;
    private JTextField programField;
    private JTextField collegeYearField;
    private JTextField shsNameField;
    private JTextField strandField;
    private JTextField shsYearField;
    private JTextField jhsNameField;
    private JTextField jhsYearField;

    public List<JTextField> getPersonalFields() {
        return personalFields;
    }

    public List<JTextField> getContactFields() {
        return contactFields;
    }

    public JTextArea getObjectiveArea() {
        return objectiveArea;
    }

    public void setObjectiveArea(JTextArea objectiveArea) {
        this.objectiveArea = objectiveArea;
    }

    public JTextArea getExperienceArea() {
        return experienceArea;
    }

    public void setExperienceArea(JTextArea experienceArea) {
        this.experienceArea = experienceArea;
    }

    public JTextArea getSkillsArea() {
        return skillsArea;
    }

    public void setSkillsArea(JTextArea skillsArea) {
        this.skillsArea = skillsArea;
    }

    public JTextField getCollegeNameField() {
        return collegeNameField;
    }

    public void setCollegeNameField(JTextField collegeNameField) {
        this.collegeNameField = collegeNameField;
    }

    public JTextField getProgramField() {
        return programField;
    }

    public void setProgramField(JTextField programField) {
        this.programField = programField;
    }

    public JTextField getCollegeYearField() {
        return collegeYearField;
    }

    public void setCollegeYearField(JTextField collegeYearField) {
        this.collegeYearField = collegeYearField;
    }

    public JTextField getShsNameField() {
        return shsNameField;
    }

    public void setShsNameField(JTextField shsNameField) {
        this.shsNameField = shsNameField;
    }

    public JTextField getStrandField() {
        return strandField;
    }

    public void setStrandField(JTextField strandField) {
        this.strandField = strandField;
    }

    public JTextField getShsYearField() {
        return shsYearField;
    }

    public void setShsYearField(JTextField shsYearField) {
        this.shsYearField = shsYearField;
    }

    public JTextField getJhsNameField() {
        return jhsNameField;
    }

    public void setJhsNameField(JTextField jhsNameField) {
        this.jhsNameField = jhsNameField;
    }

    public JTextField getJhsYearField() {
        return jhsYearField;
    }

    public void setJhsYearField(JTextField jhsYearField) {
        this.jhsYearField = jhsYearField;
    }
}