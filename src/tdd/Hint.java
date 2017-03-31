/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author Роман
 */
public class Hint {
    public boolean isUseFCBCall = true;
    public boolean isRemoveFalseAnswers = true;
    public boolean isCallWitnesses = true;

    public boolean isIsUseFCBCall() {
        return isUseFCBCall;
    }

    public void setIsUseFCBCall(boolean isUseFCBCall) {
        this.isUseFCBCall = isUseFCBCall;
    }

    public boolean isIsRemoveFalseAnswers() {
        return isRemoveFalseAnswers;
    }

    public void setIsRemoveFalseAnswers(boolean isRemoveFalseAnswers) {
        this.isRemoveFalseAnswers = isRemoveFalseAnswers;
    }

    public boolean isIsCallWitnesses() {
        return isCallWitnesses;
    }

    public void setIsCallWitnesses(boolean isCallWitnesses) {
        this.isCallWitnesses = isCallWitnesses;
    }

    void useFSBCall() {
        this.setIsUseFCBCall(false);
    }

    void useCallWitnesses() {
        this.setIsCallWitnesses(false);
    }
    
}
