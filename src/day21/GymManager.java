package day21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class GymManager {
    HashSet<Member> allMembers = new HashSet<>();
    TreeSet<String> vipMember = new TreeSet<>();
    LinkedHashSet<Member> recentMember = new LinkedHashSet<>();

    //adding members
    public void addMember(Member member) {
        boolean memberExists=false;
        for (Member m : allMembers){
            if (m.getId()==member.getId()){
                memberExists=true;
            }
        }
        if (!memberExists) {
            allMembers.add(member);
            recentMember.add(member);
            System.out.println("Member "+member.getId()+ " successfully added!");
            if (member.getMembershipType().equals("VIP")) {
                vipMember.add(member.getName());
                System.out.println("Member "+member.getId()+ " is a VIP member");
            }
        }
        else System.out.println("Member already exists!");

    }

    //display all
    public void displayAllMembers() {
        for (Member m : allMembers) {
            System.out.println(m);
        }
    }

    //display vip members
    public void displayVipMembers() {
        for (String member : vipMember) {
            System.out.println(member);
        }
    }

    //display recent members
    public void displayRecentMembers() {
        for (Member recentM : recentMember) {
            System.out.println(recentM);
        }
    }
}
