
package com.androidracingpost.betfinder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bet {

    @SerializedName("uid")
    @Expose
    private int uid;
    @SerializedName("race_uid")
    @Expose
    private int raceUid;
    @SerializedName("race_datetime")
    @Expose
    private String raceDatetime;
    @SerializedName("race_jump")
    @Expose
    private int raceJump;
    @SerializedName("race_8runners")
    @Expose
    private int race8runners;
    @SerializedName("race_run_nos")
    @Expose
    private int raceRunNos;
    @SerializedName("race_type")
    @Expose
    private String raceType;
    @SerializedName("race_going")
    @Expose
    private String raceGoing;
    @SerializedName("owner_uid")
    @Expose
    private int ownerUid;
    @SerializedName("owner_choice")
    @Expose
    private String ownerChoice;
    @SerializedName("rp_owner_choice")
    @Expose
    private String rpOwnerChoice;
    @SerializedName("ctry_code")
    @Expose
    private String ctryCode;
    @SerializedName("course_uid")
    @Expose
    private int courseUid;
    @SerializedName("course_name")
    @Expose
    private String courseName;
    @SerializedName("diffusion_course_name")
    @Expose
    private String diffusionCourseName;
    @SerializedName("course_key")
    @Expose
    private String courseKey;
    @SerializedName("horse_uid")
    @Expose
    private int horseUid;
    @SerializedName("horse_name")
    @Expose
    private String horseName;
    @SerializedName("horse_name_lc")
    @Expose
    private String horseNameLc;
    @SerializedName("trainer_uid")
    @Expose
    private int trainerUid;
    @SerializedName("trainer_name")
    @Expose
    private String trainerName;
    @SerializedName("trainer_name_lc")
    @Expose
    private String trainerNameLc;
    @SerializedName("jockey_uid")
    @Expose
    private int jockeyUid;
    @SerializedName("jockey_name")
    @Expose
    private String jockeyName;
    @SerializedName("jockey_name_lc")
    @Expose
    private String jockeyNameLc;
    @SerializedName("weight_allowance_lbs")
    @Expose
    private int weightAllowanceLbs;
    @SerializedName("sire_uid")
    @Expose
    private int sireUid;
    @SerializedName("sire_horse_name")
    @Expose
    private String sireHorseName;
    @SerializedName("winner")
    @Expose
    private int winner;
    @SerializedName("placed")
    @Expose
    private int placed;
    @SerializedName("bfv")
    @Expose
    private int bfv;
    @SerializedName("postmark")
    @Expose
    private int postmark;
    @SerializedName("topspeed")
    @Expose
    private int topspeed;
    @SerializedName("silk_red")
    @Expose
    private int silkRed;
    @SerializedName("silk_orange")
    @Expose
    private int silkOrange;
    @SerializedName("silk_yellow")
    @Expose
    private int silkYellow;
    @SerializedName("silk_green")
    @Expose
    private int silkGreen;
    @SerializedName("silk_blue")
    @Expose
    private int silkBlue;
    @SerializedName("silk_purple")
    @Expose
    private int silkPurple;
    @SerializedName("silk_pink")
    @Expose
    private int silkPink;
    @SerializedName("silk_black")
    @Expose
    private int silkBlack;
    @SerializedName("silk_white")
    @Expose
    private int silkWhite;
    @SerializedName("silk_brown")
    @Expose
    private int silkBrown;
    @SerializedName("silk_image_path")
    @Expose
    private String silkImagePath;
    @SerializedName("improver")
    @Expose
    private int improver;
    @SerializedName("drop_in_class")
    @Expose
    private int dropInClass;
    @SerializedName("blinkers")
    @Expose
    private int blinkers;
    @SerializedName("big_trainer")
    @Expose
    private int bigTrainer;
    @SerializedName("trainer_inform")
    @Expose
    private int trainerInform;
    @SerializedName("course_trainer")
    @Expose
    private int courseTrainer;
    @SerializedName("trainer_fur_trv")
    @Expose
    private int trainerFurTrv;
    @SerializedName("big_jockey")
    @Expose
    private int bigJockey;
    @SerializedName("jockey_inform")
    @Expose
    private int jockeyInform;
    @SerializedName("course_jockey")
    @Expose
    private int courseJockey;
    @SerializedName("one_tr_jockey")
    @Expose
    private int oneTrJockey;
    @SerializedName("suit_going")
    @Expose
    private int suitGoing;
    @SerializedName("suit_course")
    @Expose
    private int suitCourse;
    @SerializedName("suit_dist")
    @Expose
    private int suitDist;
    @SerializedName("spotlight")
    @Expose
    private int spotlight;
    @SerializedName("postdata")
    @Expose
    private int postdata;
    @SerializedName("lambourn")
    @Expose
    private int lambourn;
    @SerializedName("north")
    @Expose
    private int north;
    @SerializedName("daily_tel")
    @Expose
    private int dailyTel;
    @SerializedName("times")
    @Expose
    private int times;
    @SerializedName("telegraph")
    @Expose
    private int telegraph;
    @SerializedName("guardian")
    @Expose
    private int guardian;
    @SerializedName("daily_mail")
    @Expose
    private int dailyMail;
    @SerializedName("daily_exp")
    @Expose
    private int dailyExp;
    @SerializedName("daily_mir")
    @Expose
    private int dailyMir;
    @SerializedName("sun")
    @Expose
    private int sun;
    @SerializedName("star")
    @Expose
    private int star;
    @SerializedName("daily_rec")
    @Expose
    private int dailyRec;
    @SerializedName("nap")
    @Expose
    private int nap;
    @SerializedName("fc_odds_uid")
    @Expose
    private int fcOddsUid;
    @SerializedName("fc_odds_value")
    @Expose
    private int fcOddsValue;
    @SerializedName("fc_odds")
    @Expose
    private String fcOdds;
    @SerializedName("fc_fav")
    @Expose
    private int fcFav;
    @SerializedName("fc_long_shot")
    @Expose
    private int fcLongShot;
    @SerializedName("deleted")
    @Expose
    private int deleted;

    /**
     * 
     * @return
     *     The uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The raceUid
     */
    public int getRaceUid() {
        return raceUid;
    }

    /**
     * 
     * @param raceUid
     *     The race_uid
     */
    public void setRaceUid(int raceUid) {
        this.raceUid = raceUid;
    }

    /**
     * 
     * @return
     *     The raceDatetime
     */
    public String getRaceDatetime() {
        return raceDatetime;
    }

    /**
     * 
     * @param raceDatetime
     *     The race_datetime
     */
    public void setRaceDatetime(String raceDatetime) {
        this.raceDatetime = raceDatetime;
    }

    /**
     * 
     * @return
     *     The raceJump
     */
    public int getRaceJump() {
        return raceJump;
    }

    /**
     * 
     * @param raceJump
     *     The race_jump
     */
    public void setRaceJump(int raceJump) {
        this.raceJump = raceJump;
    }

    /**
     * 
     * @return
     *     The race8runners
     */
    public int getRace8runners() {
        return race8runners;
    }

    /**
     * 
     * @param race8runners
     *     The race_8runners
     */
    public void setRace8runners(int race8runners) {
        this.race8runners = race8runners;
    }

    /**
     * 
     * @return
     *     The raceRunNos
     */
    public int getRaceRunNos() {
        return raceRunNos;
    }

    /**
     * 
     * @param raceRunNos
     *     The race_run_nos
     */
    public void setRaceRunNos(int raceRunNos) {
        this.raceRunNos = raceRunNos;
    }

    /**
     * 
     * @return
     *     The raceType
     */
    public String getRaceType() {
        return raceType;
    }

    /**
     * 
     * @param raceType
     *     The race_type
     */
    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }

    /**
     * 
     * @return
     *     The raceGoing
     */
    public String getRaceGoing() {
        return raceGoing;
    }

    /**
     * 
     * @param raceGoing
     *     The race_going
     */
    public void setRaceGoing(String raceGoing) {
        this.raceGoing = raceGoing;
    }

    /**
     * 
     * @return
     *     The ownerUid
     */
    public int getOwnerUid() {
        return ownerUid;
    }

    /**
     * 
     * @param ownerUid
     *     The owner_uid
     */
    public void setOwnerUid(int ownerUid) {
        this.ownerUid = ownerUid;
    }

    /**
     * 
     * @return
     *     The ownerChoice
     */
    public String getOwnerChoice() {
        return ownerChoice;
    }

    /**
     * 
     * @param ownerChoice
     *     The owner_choice
     */
    public void setOwnerChoice(String ownerChoice) {
        this.ownerChoice = ownerChoice;
    }

    /**
     * 
     * @return
     *     The rpOwnerChoice
     */
    public String getRpOwnerChoice() {
        return rpOwnerChoice;
    }

    /**
     * 
     * @param rpOwnerChoice
     *     The rp_owner_choice
     */
    public void setRpOwnerChoice(String rpOwnerChoice) {
        this.rpOwnerChoice = rpOwnerChoice;
    }

    /**
     * 
     * @return
     *     The ctryCode
     */
    public String getCtryCode() {
        return ctryCode;
    }

    /**
     * 
     * @param ctryCode
     *     The ctry_code
     */
    public void setCtryCode(String ctryCode) {
        this.ctryCode = ctryCode;
    }

    /**
     * 
     * @return
     *     The courseUid
     */
    public int getCourseUid() {
        return courseUid;
    }

    /**
     * 
     * @param courseUid
     *     The course_uid
     */
    public void setCourseUid(int courseUid) {
        this.courseUid = courseUid;
    }

    /**
     * 
     * @return
     *     The courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * 
     * @param courseName
     *     The course_name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * 
     * @return
     *     The diffusionCourseName
     */
    public String getDiffusionCourseName() {
        return diffusionCourseName;
    }

    /**
     * 
     * @param diffusionCourseName
     *     The diffusion_course_name
     */
    public void setDiffusionCourseName(String diffusionCourseName) {
        this.diffusionCourseName = diffusionCourseName;
    }

    /**
     * 
     * @return
     *     The courseKey
     */
    public String getCourseKey() {
        return courseKey;
    }

    /**
     * 
     * @param courseKey
     *     The course_key
     */
    public void setCourseKey(String courseKey) {
        this.courseKey = courseKey;
    }

    /**
     * 
     * @return
     *     The horseUid
     */
    public int getHorseUid() {
        return horseUid;
    }

    /**
     * 
     * @param horseUid
     *     The horse_uid
     */
    public void setHorseUid(int horseUid) {
        this.horseUid = horseUid;
    }

    /**
     * 
     * @return
     *     The horseName
     */
    public String getHorseName() {
        return horseName;
    }

    /**
     * 
     * @param horseName
     *     The horse_name
     */
    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    /**
     * 
     * @return
     *     The horseNameLc
     */
    public String getHorseNameLc() {
        return horseNameLc;
    }

    /**
     * 
     * @param horseNameLc
     *     The horse_name_lc
     */
    public void setHorseNameLc(String horseNameLc) {
        this.horseNameLc = horseNameLc;
    }

    /**
     * 
     * @return
     *     The trainerUid
     */
    public int getTrainerUid() {
        return trainerUid;
    }

    /**
     * 
     * @param trainerUid
     *     The trainer_uid
     */
    public void setTrainerUid(int trainerUid) {
        this.trainerUid = trainerUid;
    }

    /**
     * 
     * @return
     *     The trainerName
     */
    public String getTrainerName() {
        return trainerName;
    }

    /**
     * 
     * @param trainerName
     *     The trainer_name
     */
    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    /**
     * 
     * @return
     *     The trainerNameLc
     */
    public String getTrainerNameLc() {
        return trainerNameLc;
    }

    /**
     * 
     * @param trainerNameLc
     *     The trainer_name_lc
     */
    public void setTrainerNameLc(String trainerNameLc) {
        this.trainerNameLc = trainerNameLc;
    }

    /**
     * 
     * @return
     *     The jockeyUid
     */
    public int getJockeyUid() {
        return jockeyUid;
    }

    /**
     * 
     * @param jockeyUid
     *     The jockey_uid
     */
    public void setJockeyUid(int jockeyUid) {
        this.jockeyUid = jockeyUid;
    }

    /**
     * 
     * @return
     *     The jockeyName
     */
    public String getJockeyName() {
        return jockeyName;
    }

    /**
     * 
     * @param jockeyName
     *     The jockey_name
     */
    public void setJockeyName(String jockeyName) {
        this.jockeyName = jockeyName;
    }

    /**
     * 
     * @return
     *     The jockeyNameLc
     */
    public String getJockeyNameLc() {
        return jockeyNameLc;
    }

    /**
     * 
     * @param jockeyNameLc
     *     The jockey_name_lc
     */
    public void setJockeyNameLc(String jockeyNameLc) {
        this.jockeyNameLc = jockeyNameLc;
    }

    /**
     * 
     * @return
     *     The weightAllowanceLbs
     */
    public int getWeightAllowanceLbs() {
        return weightAllowanceLbs;
    }

    /**
     * 
     * @param weightAllowanceLbs
     *     The weight_allowance_lbs
     */
    public void setWeightAllowanceLbs(int weightAllowanceLbs) {
        this.weightAllowanceLbs = weightAllowanceLbs;
    }

    /**
     * 
     * @return
     *     The sireUid
     */
    public int getSireUid() {
        return sireUid;
    }

    /**
     * 
     * @param sireUid
     *     The sire_uid
     */
    public void setSireUid(int sireUid) {
        this.sireUid = sireUid;
    }

    /**
     * 
     * @return
     *     The sireHorseName
     */
    public String getSireHorseName() {
        return sireHorseName;
    }

    /**
     * 
     * @param sireHorseName
     *     The sire_horse_name
     */
    public void setSireHorseName(String sireHorseName) {
        this.sireHorseName = sireHorseName;
    }

    /**
     * 
     * @return
     *     The winner
     */
    public int getWinner() {
        return winner;
    }

    /**
     * 
     * @param winner
     *     The winner
     */
    public void setWinner(int winner) {
        this.winner = winner;
    }

    /**
     * 
     * @return
     *     The placed
     */
    public int getPlaced() {
        return placed;
    }

    /**
     * 
     * @param placed
     *     The placed
     */
    public void setPlaced(int placed) {
        this.placed = placed;
    }

    /**
     * 
     * @return
     *     The bfv
     */
    public int getBfv() {
        return bfv;
    }

    /**
     * 
     * @param bfv
     *     The bfv
     */
    public void setBfv(int bfv) {
        this.bfv = bfv;
    }

    /**
     * 
     * @return
     *     The postmark
     */
    public int getPostmark() {
        return postmark;
    }

    /**
     * 
     * @param postmark
     *     The postmark
     */
    public void setPostmark(int postmark) {
        this.postmark = postmark;
    }

    /**
     * 
     * @return
     *     The topspeed
     */
    public int getTopspeed() {
        return topspeed;
    }

    /**
     * 
     * @param topspeed
     *     The topspeed
     */
    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    /**
     * 
     * @return
     *     The silkRed
     */
    public int getSilkRed() {
        return silkRed;
    }

    /**
     * 
     * @param silkRed
     *     The silk_red
     */
    public void setSilkRed(int silkRed) {
        this.silkRed = silkRed;
    }

    /**
     * 
     * @return
     *     The silkOrange
     */
    public int getSilkOrange() {
        return silkOrange;
    }

    /**
     * 
     * @param silkOrange
     *     The silk_orange
     */
    public void setSilkOrange(int silkOrange) {
        this.silkOrange = silkOrange;
    }

    /**
     * 
     * @return
     *     The silkYellow
     */
    public int getSilkYellow() {
        return silkYellow;
    }

    /**
     * 
     * @param silkYellow
     *     The silk_yellow
     */
    public void setSilkYellow(int silkYellow) {
        this.silkYellow = silkYellow;
    }

    /**
     * 
     * @return
     *     The silkGreen
     */
    public int getSilkGreen() {
        return silkGreen;
    }

    /**
     * 
     * @param silkGreen
     *     The silk_green
     */
    public void setSilkGreen(int silkGreen) {
        this.silkGreen = silkGreen;
    }

    /**
     * 
     * @return
     *     The silkBlue
     */
    public int getSilkBlue() {
        return silkBlue;
    }

    /**
     * 
     * @param silkBlue
     *     The silk_blue
     */
    public void setSilkBlue(int silkBlue) {
        this.silkBlue = silkBlue;
    }

    /**
     * 
     * @return
     *     The silkPurple
     */
    public int getSilkPurple() {
        return silkPurple;
    }

    /**
     * 
     * @param silkPurple
     *     The silk_purple
     */
    public void setSilkPurple(int silkPurple) {
        this.silkPurple = silkPurple;
    }

    /**
     * 
     * @return
     *     The silkPink
     */
    public int getSilkPink() {
        return silkPink;
    }

    /**
     * 
     * @param silkPink
     *     The silk_pink
     */
    public void setSilkPink(int silkPink) {
        this.silkPink = silkPink;
    }

    /**
     * 
     * @return
     *     The silkBlack
     */
    public int getSilkBlack() {
        return silkBlack;
    }

    /**
     * 
     * @param silkBlack
     *     The silk_black
     */
    public void setSilkBlack(int silkBlack) {
        this.silkBlack = silkBlack;
    }

    /**
     * 
     * @return
     *     The silkWhite
     */
    public int getSilkWhite() {
        return silkWhite;
    }

    /**
     * 
     * @param silkWhite
     *     The silk_white
     */
    public void setSilkWhite(int silkWhite) {
        this.silkWhite = silkWhite;
    }

    /**
     * 
     * @return
     *     The silkBrown
     */
    public int getSilkBrown() {
        return silkBrown;
    }

    /**
     * 
     * @param silkBrown
     *     The silk_brown
     */
    public void setSilkBrown(int silkBrown) {
        this.silkBrown = silkBrown;
    }

    /**
     * 
     * @return
     *     The silkImagePath
     */
    public String getSilkImagePath() {
        return silkImagePath;
    }

    /**
     * 
     * @param silkImagePath
     *     The silk_image_path
     */
    public void setSilkImagePath(String silkImagePath) {
        this.silkImagePath = silkImagePath;
    }

    /**
     * 
     * @return
     *     The improver
     */
    public int getImprover() {
        return improver;
    }

    /**
     * 
     * @param improver
     *     The improver
     */
    public void setImprover(int improver) {
        this.improver = improver;
    }

    /**
     * 
     * @return
     *     The dropInClass
     */
    public int getDropInClass() {
        return dropInClass;
    }

    /**
     * 
     * @param dropInClass
     *     The drop_in_class
     */
    public void setDropInClass(int dropInClass) {
        this.dropInClass = dropInClass;
    }

    /**
     * 
     * @return
     *     The blinkers
     */
    public int getBlinkers() {
        return blinkers;
    }

    /**
     * 
     * @param blinkers
     *     The blinkers
     */
    public void setBlinkers(int blinkers) {
        this.blinkers = blinkers;
    }

    /**
     * 
     * @return
     *     The bigTrainer
     */
    public int getBigTrainer() {
        return bigTrainer;
    }

    /**
     * 
     * @param bigTrainer
     *     The big_trainer
     */
    public void setBigTrainer(int bigTrainer) {
        this.bigTrainer = bigTrainer;
    }

    /**
     * 
     * @return
     *     The trainerInform
     */
    public int getTrainerInform() {
        return trainerInform;
    }

    /**
     * 
     * @param trainerInform
     *     The trainer_inform
     */
    public void setTrainerInform(int trainerInform) {
        this.trainerInform = trainerInform;
    }

    /**
     * 
     * @return
     *     The courseTrainer
     */
    public int getCourseTrainer() {
        return courseTrainer;
    }

    /**
     * 
     * @param courseTrainer
     *     The course_trainer
     */
    public void setCourseTrainer(int courseTrainer) {
        this.courseTrainer = courseTrainer;
    }

    /**
     * 
     * @return
     *     The trainerFurTrv
     */
    public int getTrainerFurTrv() {
        return trainerFurTrv;
    }

    /**
     * 
     * @param trainerFurTrv
     *     The trainer_fur_trv
     */
    public void setTrainerFurTrv(int trainerFurTrv) {
        this.trainerFurTrv = trainerFurTrv;
    }

    /**
     * 
     * @return
     *     The bigJockey
     */
    public int getBigJockey() {
        return bigJockey;
    }

    /**
     * 
     * @param bigJockey
     *     The big_jockey
     */
    public void setBigJockey(int bigJockey) {
        this.bigJockey = bigJockey;
    }

    /**
     * 
     * @return
     *     The jockeyInform
     */
    public int getJockeyInform() {
        return jockeyInform;
    }

    /**
     * 
     * @param jockeyInform
     *     The jockey_inform
     */
    public void setJockeyInform(int jockeyInform) {
        this.jockeyInform = jockeyInform;
    }

    /**
     * 
     * @return
     *     The courseJockey
     */
    public int getCourseJockey() {
        return courseJockey;
    }

    /**
     * 
     * @param courseJockey
     *     The course_jockey
     */
    public void setCourseJockey(int courseJockey) {
        this.courseJockey = courseJockey;
    }

    /**
     * 
     * @return
     *     The oneTrJockey
     */
    public int getOneTrJockey() {
        return oneTrJockey;
    }

    /**
     * 
     * @param oneTrJockey
     *     The one_tr_jockey
     */
    public void setOneTrJockey(int oneTrJockey) {
        this.oneTrJockey = oneTrJockey;
    }

    /**
     * 
     * @return
     *     The suitGoing
     */
    public int getSuitGoing() {
        return suitGoing;
    }

    /**
     * 
     * @param suitGoing
     *     The suit_going
     */
    public void setSuitGoing(int suitGoing) {
        this.suitGoing = suitGoing;
    }

    /**
     * 
     * @return
     *     The suitCourse
     */
    public int getSuitCourse() {
        return suitCourse;
    }

    /**
     * 
     * @param suitCourse
     *     The suit_course
     */
    public void setSuitCourse(int suitCourse) {
        this.suitCourse = suitCourse;
    }

    /**
     * 
     * @return
     *     The suitDist
     */
    public int getSuitDist() {
        return suitDist;
    }

    /**
     * 
     * @param suitDist
     *     The suit_dist
     */
    public void setSuitDist(int suitDist) {
        this.suitDist = suitDist;
    }

    /**
     * 
     * @return
     *     The spotlight
     */
    public int getSpotlight() {
        return spotlight;
    }

    /**
     * 
     * @param spotlight
     *     The spotlight
     */
    public void setSpotlight(int spotlight) {
        this.spotlight = spotlight;
    }

    /**
     * 
     * @return
     *     The postdata
     */
    public int getPostdata() {
        return postdata;
    }

    /**
     * 
     * @param postdata
     *     The postdata
     */
    public void setPostdata(int postdata) {
        this.postdata = postdata;
    }

    /**
     * 
     * @return
     *     The lambourn
     */
    public int getLambourn() {
        return lambourn;
    }

    /**
     * 
     * @param lambourn
     *     The lambourn
     */
    public void setLambourn(int lambourn) {
        this.lambourn = lambourn;
    }

    /**
     * 
     * @return
     *     The north
     */
    public int getNorth() {
        return north;
    }

    /**
     * 
     * @param north
     *     The north
     */
    public void setNorth(int north) {
        this.north = north;
    }

    /**
     * 
     * @return
     *     The dailyTel
     */
    public int getDailyTel() {
        return dailyTel;
    }

    /**
     * 
     * @param dailyTel
     *     The daily_tel
     */
    public void setDailyTel(int dailyTel) {
        this.dailyTel = dailyTel;
    }

    /**
     * 
     * @return
     *     The times
     */
    public int getTimes() {
        return times;
    }

    /**
     * 
     * @param times
     *     The times
     */
    public void setTimes(int times) {
        this.times = times;
    }

    /**
     * 
     * @return
     *     The telegraph
     */
    public int getTelegraph() {
        return telegraph;
    }

    /**
     * 
     * @param telegraph
     *     The telegraph
     */
    public void setTelegraph(int telegraph) {
        this.telegraph = telegraph;
    }

    /**
     * 
     * @return
     *     The guardian
     */
    public int getGuardian() {
        return guardian;
    }

    /**
     * 
     * @param guardian
     *     The guardian
     */
    public void setGuardian(int guardian) {
        this.guardian = guardian;
    }

    /**
     * 
     * @return
     *     The dailyMail
     */
    public int getDailyMail() {
        return dailyMail;
    }

    /**
     * 
     * @param dailyMail
     *     The daily_mail
     */
    public void setDailyMail(int dailyMail) {
        this.dailyMail = dailyMail;
    }

    /**
     * 
     * @return
     *     The dailyExp
     */
    public int getDailyExp() {
        return dailyExp;
    }

    /**
     * 
     * @param dailyExp
     *     The daily_exp
     */
    public void setDailyExp(int dailyExp) {
        this.dailyExp = dailyExp;
    }

    /**
     * 
     * @return
     *     The dailyMir
     */
    public int getDailyMir() {
        return dailyMir;
    }

    /**
     * 
     * @param dailyMir
     *     The daily_mir
     */
    public void setDailyMir(int dailyMir) {
        this.dailyMir = dailyMir;
    }

    /**
     * 
     * @return
     *     The sun
     */
    public int getSun() {
        return sun;
    }

    /**
     * 
     * @param sun
     *     The sun
     */
    public void setSun(int sun) {
        this.sun = sun;
    }

    /**
     * 
     * @return
     *     The star
     */
    public int getStar() {
        return star;
    }

    /**
     * 
     * @param star
     *     The star
     */
    public void setStar(int star) {
        this.star = star;
    }

    /**
     * 
     * @return
     *     The dailyRec
     */
    public int getDailyRec() {
        return dailyRec;
    }

    /**
     * 
     * @param dailyRec
     *     The daily_rec
     */
    public void setDailyRec(int dailyRec) {
        this.dailyRec = dailyRec;
    }

    /**
     * 
     * @return
     *     The nap
     */
    public int getNap() {
        return nap;
    }

    /**
     * 
     * @param nap
     *     The nap
     */
    public void setNap(int nap) {
        this.nap = nap;
    }

    /**
     * 
     * @return
     *     The fcOddsUid
     */
    public int getFcOddsUid() {
        return fcOddsUid;
    }

    /**
     * 
     * @param fcOddsUid
     *     The fc_odds_uid
     */
    public void setFcOddsUid(int fcOddsUid) {
        this.fcOddsUid = fcOddsUid;
    }

    /**
     * 
     * @return
     *     The fcOddsValue
     */
    public int getFcOddsValue() {
        return fcOddsValue;
    }

    /**
     * 
     * @param fcOddsValue
     *     The fc_odds_value
     */
    public void setFcOddsValue(int fcOddsValue) {
        this.fcOddsValue = fcOddsValue;
    }

    /**
     * 
     * @return
     *     The fcOdds
     */
    public String getFcOdds() {
        return fcOdds;
    }

    /**
     * 
     * @param fcOdds
     *     The fc_odds
     */
    public void setFcOdds(String fcOdds) {
        this.fcOdds = fcOdds;
    }

    /**
     * 
     * @return
     *     The fcFav
     */
    public int getFcFav() {
        return fcFav;
    }

    /**
     * 
     * @param fcFav
     *     The fc_fav
     */
    public void setFcFav(int fcFav) {
        this.fcFav = fcFav;
    }

    /**
     * 
     * @return
     *     The fcLongShot
     */
    public int getFcLongShot() {
        return fcLongShot;
    }

    /**
     * 
     * @param fcLongShot
     *     The fc_long_shot
     */
    public void setFcLongShot(int fcLongShot) {
        this.fcLongShot = fcLongShot;
    }

    /**
     * 
     * @return
     *     The deleted
     */
    public int getDeleted() {
        return deleted;
    }

    /**
     * 
     * @param deleted
     *     The deleted
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

}
