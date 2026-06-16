import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * 社員情報クラス
 */
public class Employee {
    private String id; // 社員ID
    private String name; // 名前
    private LocalDate birthDate; // 生年月日
    private int engineerExperience; // エンジニア歴
    private String languages;
    private String careerHistory;
    private String trainingHistory;
    private double technicalSkill;
    private double trainingAttitude;
    private double communicationSkill;
    private double leadership;
    private String note;
    private LocalDateTime savedDate;

    /**
     * コンストラクタ
     * 
     * @param id                 社員ID
     * @param name               名前
     * @param birthDate          生年月日
     * @param hireDate           入社年月
     * @param engineerExperience エンジニア歴
     * @param languages          扱える言語
     * @param careerHistory      経歴
     * @param trainingHistory    研修受講歴
     * @param technicalSkill     技術力
     * @param trainingAttitude   受講態度
     * @param communicationSkill コミュニケーション能力
     * @param leadership         リーダーシップ
     * @param note               備考
     * @param savedDate          保存日時
     */
    public Employee(
            String id,
            String name,
            LocalDate birthDate,
            String hireDate,
            int engineerExperience,
            String languages,
            String careerHistory,
            String trainingHistory,
            double technicalSkill,
            double trainingAttitude,
            double communicationSkill,
            double leadership,
            String note,
            LocalDate savedDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.engineerExperience = engineerExperience;
        this.languages = languages;
        this.careerHistory = careerHistory;
        this.trainingHistory = trainingHistory;
        this.technicalSkill = technicalSkill;
        this.trainingAttitude = trainingAttitude;
        this.communicationSkill = communicationSkill;
        this.leadership = leadership;
        this.note = note;
        this.savedDate = savedDate;
    }

    /**
     * 社員IDを取得する
     * 
     * @return 社員IDを取得する
     */
    public String getId() {
        return id;
    }

    /**
     * 名前を取得する
     * 
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 生年月日を取得する
     * 
     * @return 生年月日
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * 入社年月を取得する
     * 
     * @return 入社年月
     */
    public String getHireDate() {
        return hireDate;
    }

    /**
     * エンジニア歴を取得する
     * 
     * @return エンジニア歴
     */
    public int getEngineerExperience() {
        return engineerExperience;
    }

    /**
     * 言語を取得する
     * 
     * @return 言語
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * 経歴を取得する
     * 
     * @return 経歴
     */
    public String getCareerHistory() {
        return careerHistory;
    }

    /**
     * 研修受講歴を取得する
     * 
     * @return 研修受講歴
     */
    public String getTrainingHistory() {
        return trainingHistory;
    }

    /**
     * 技術力を取得する
     * 
     * @return 技術力
     */
    public double getTechnicalSkill() {
        return technicalSkill;
    }

    /**
     * 受講態度を取得する
     * 
     * @return 受講態度
     */
    public double getTrainingAttitude() {
        return trainingAttitude;
    }

    /**
     * コミュニケーション能力を取得する
     * 
     * @return コミュニケーション能力
     */
    public double getCommunicationSkill() {
        return communicationSkill;
    }

    /**
     * リーダーシップを取得する
     * 
     * @return リーダーシップ
     */
    public double getLeadership() {
        return leadership;
    }

    /**
     * 備考を取得する
     * 
     * @return 備考
     */
    public String getNote() {
        return note;
    }

    /**
     * 保存日時を取得する
     * 
     * @return 保存日時
     */
    public LocalDateTime getSavedDate() {
        return savedDate;
    }

    @Override
    public String toString() {
        return employeeId + ","
                + name + ","
                + birthDate + ","
                + hireDate + ","
                + engineerExperience + ","
                + languages + ","
                + careerHistory + ","
                + trainingHistory + ","
                + technicalSkill + ","
                + trainingAttitude + ","
                + communicationSkill + ","
                + leadership + ","
                + note + ","
                + savedDate; // CSV形式での出力用フォーマット
    }
}
