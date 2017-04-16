package com.beimin.eveapi.model.character;

import java.util.Date;

public class Notification {
    private long notificationID;
    private int typeID;
    private long senderID;
    private String senderName;
    private Date sentDate;
    private boolean read;

    private long characterId;
    private String text;

    public enum NotificationType {
        Legacy(1,"Legacy"),
        Character_deleted(2,"Character deleted"),
        Give_medal_to_character(3,"Give medal to character"),
        Alliance_maintenance_bill(4,"Alliance maintenance bill"),
        Alliance_war_declared(5,"Alliance war declared"),
        Alliance_war_surrender(6,"Alliance war surrender"),
        Alliance_war_retracted(7,"Alliance war retracted"),
        Alliance_war_invalidated_by_Concord(8,"Alliance war invalidated by Concord"),
        Bill_issued_to_a_character(9,"Bill issued to a character"),
        Bill_issued_to_corporation_or_alliance(10,"Bill issued to corporation or alliance"),
        Bill_not_paid_because_there(11,"Bill not paid because there's not enough ISK available"),
        Bill_issued_by_a_character_paid(12,"Bill, issued by a character, paid"),
        Bill_issued_by_a_corporation_or_alliance_paid(13,"Bill, issued by a corporation or alliance, paid"),
        Bounty_claimed(14,"Bounty claimed"),
        Clone_activated(15,"Clone activated"),
        New_corp_member_application(16,"New corp member application"),
        Corp_application_rejected(17,"Corp application rejected"),
        Corp_application_accepted(18,"Corp application accepted"),
        Corp_tax_rate_changed(19,"Corp tax rate changed"),
        Corp_news_report_typically_for_shareholders(20,"Corp news report, typically for shareholders"),
        Player_leaves_corp(21,"Player leaves corp"),
        Corp_news_new_CEO(22,"Corp news, new CEO"),
        Corp_dividend_liquidation_sent_to_shareholders(23,"Corp dividend/liquidation, sent to shareholders"),
        Corp_dividend_payout_sent_to_shareholders(24,"Corp dividend payout, sent to shareholders"),
        Corp_vote_created(25,"Corp vote created"),
        Corp_CEO_votes_revoked_during_voting(26,"Corp CEO votes revoked during voting"),
        Corp_declares_war(27,"Corp declares war"),
        Corp_war_has_started(28,"Corp war has started"),
        Corp_surrenders_war(29,"Corp surrenders war"),
        Corp_retracts_war(30,"Corp retracts war"),
        Corp_war_invalidated_by_Concord(31,"Corp war invalidated by Concord"),
        Container_password_retrieval(32,"Container password retrieval"),
        Contraband_or_low_standings_cause_an_attack_or_items_being_confiscated(33,"Contraband or low standings cause an attack or items being confiscated"),
        First_ship_insurance(34,"First ship insurance"),
        Ship_destroyed_insurance_payed(35,"Ship destroyed, insurance payed"),
        Insurance_contract_invalidated_runs_out(36,"Insurance contract invalidated/runs out"),
        Sovereignty_claim_fails_alliance(37,"Sovereignty claim fails (alliance)"),
        Sovereignty_claim_fails_corporation(38,"Sovereignty claim fails (corporation)"),
        Sovereignty_bill_late_alliance(39,"Sovereignty bill late (alliance)"),
        Sovereignty_bill_late_corporation(40,"Sovereignty bill late (corporation)"),
        Sovereignty_claim_lost_alliance(41,"Sovereignty claim lost (alliance)"),
        Sovereignty_claim_lost_corporation(42,"Sovereignty claim lost (corporation)"),
        Sovereignty_claim_acquired_alliance(43,"Sovereignty claim acquired (alliance)"),
        Sovereignty_claim_acquired_corporation(44,"Sovereignty claim acquired (corporation)"),
        Alliance_anchoring_alert(45,"Alliance anchoring alert"),
        Alliance_structure_turns_vulnerable(46,"Alliance structure turns vulnerable"),
        Alliance_structure_turns_invulnerable(47,"Alliance structure turns invulnerable"),
        Sovereignty_disruptor_anchored(48,"Sovereignty disruptor anchored"),
        Structure_won_lost(49,"Structure won/lost"),
        Corp_office_lease_expiration_notice(50,"Corp office lease expiration notice"),
        Clone_contract_revoked_by_station_manager(51,"Clone contract revoked by station manager"),
        Corp_member_clones_moved_between_stations(52,"Corp member clones moved between stations"),
        Clone_contract_revoked_by_station_manager_(53,"Clone contract revoked by station manager"),
        Insurance_contract_expired(54,"Insurance contract expired"),
        Insurance_contract_issued(55,"Insurance contract issued"),
        Jump_clone_destroyed(56,"Jump clone destroyed"),
        Jump_clone_destroyed_(57,"Jump clone destroyed"),
        Corporation_joining_factional_warfare(58,"Corporation joining factional warfare"),
        Corporation_joining_factional_warfare_(59,"Corporation leaving factional warfare"),
        Corporation_kicked_from_factional_warfare_on_startup_because_of_too_low_standing_to_the_faction(60,"Corporation kicked from factional warfare on startup because of too low standing to the faction"),
        Character_kicked_from_factional_warfare_on_startup_because_of_too_low_standing_to_the_faction(61,"Character kicked from factional warfare on startup because of too low standing to the faction"),
        Corporation_in_factional_warfare_warned_on_startup_because_of_too_low_standing_to_the_faction(62,"Corporation in factional warfare warned on startup because of too low standing to the faction"),
        Character_in_factional_warfare_warned_on_startup_because_of_too_low_standing_to_the_faction(63,"Character in factional warfare warned on startup because of too low standing to the faction"),
        Character_loses_factional_warfare_rank(64,"Character loses factional warfare rank"),
        Character_gains_factional_warfare_rank(65,"Character gains factional warfare rank"),
        Agent_has_moved(66,"Agent has moved"),
        Mass_transaction_reversal_message(67,"Mass transaction reversal message"),
        Reimbursement_message(68,"Reimbursement message"),
        Agent_locates_a_character(69,"Agent locates a character"),
        Research_mission_becomes_available_from_an_agent(70,"Research mission becomes available from an agent"),
        Agent_mission_offer_expires(71,"Agent mission offer expires"),
        Agent_mission_times_out(72,"Agent mission times out"),
        Agent_offers_a_storyline_mission(73,"Agent offers a storyline mission"),
        Tutorial_message_sent_on_character_creation(74,"Tutorial message sent on character creation"),
        Tower_alert(75,"Tower alert"),
        Tower_resource_alert(76,"Tower resource alert"),
        Station_aggression_message(77,"Station aggression message"),
        Station_state_change_message(78,"Station state change message"),
        Station_conquered_message(79,"Station conquered message"),
        Station_aggression_message_(80,"Station aggression message"),
        Corporation_requests_joining_factional_warfare(81,"Corporation requests joining factional warfare"),
        Corporation_requests_leaving_factional_warfare(82,"Corporation requests leaving factional warfare"),
        Corporation_withdrawing_a_request_to_join_factional_warfare(83,"Corporation withdrawing a request to join factional warfare"),
        Corporation_withdrawing_a_request_to_leave_factional_warfare(84,"Corporation withdrawing a request to leave factional warfare"),
        Corporation_liquidation(85,"Corporation liquidation"),
        Territorial_Claim_Unit_under_attack(86,"Territorial Claim Unit under attack"),
        Sovereignty_Blockade_Unit_under_attack(87,"Sovereignty Blockade Unit under attack"),
        Infrastructure_Hub_under_attack(88,"Infrastructure Hub under attack"),
        Contact_add_notification(89,"Contact add notification"),
        Contact_edit_notification(90,"Contact edit notification"),
        Incursion_Completed(91,"Incursion Completed"),
        Corp_Kicked(92,"Corp Kicked"),
        Customs_office_has_been_attacked(93,"Customs office has been attacked"),
        Customs_office_has_entered_reinforced(94,"Customs office has entered reinforced"),
        Customs_office_has_been_transferred(95,"Customs office has been transferred"),
        FW_Alliance_Warning(96,"FW Alliance Warning"),
        FW_Alliance_Kick(97,"FW Alliance Kick"),
        AllWarCorpJoined_Msg(98,"AllWarCorpJoined Msg"),
        Ally_Joined_Defender(99,"Ally Joined Defender"),
        Ally_Has_Joined_a_War_Aggressor(100,"Ally Has Joined a War Aggressor"),
        Ally_Joined_War_Ally(101,"Ally Joined War Ally"),
        New_war_system_entity_is_offering_assistance_in_a_war(102,"New war system: entity is offering assistance in a war."),
        War_Surrender_Offer(103,"War Surrender Offer"),
        War_Surrender_Declined(104,"War Surrender Declined"),
        FacWar_LP_Payout_Kill(105,"FacWar LP Payout Kill"),
        FacWar_LP_Payout_Event(106,"FacWar LP Payout Event"),
        FacWar_LP_Disqualified_Eventd(107,"FacWar LP Disqualified Eventd"),
        FacWar_LP_Disqualified_Kill(108,"FacWar LP Disqualified Kill"),
        Alliance_Contract_Cancelled(109,"Alliance Contract Cancelled"),
        War_Ally_Declined_Offer(110,"War Ally Declined Offer"),
        Your_Bounty_Was_Claimed(111,"Your Bounty Was Claimed"),
        Bounty_placed_Char(112,"Bounty placed (Char)"),
        Bounty_Placed_Corp(113,"Bounty Placed (Corp)"),
        Bounty_Placed_Alliance(114,"Bounty Placed (Alliance)"),
        Kill_Right_Available(115,"Kill Right Available"),
        Kill_right_Available_Open(116,"Kill right Available Open"),
        Kill_Right_Earned(117,"Kill Right Earned"),
        Kill_right_Used(118,"Kill right Used"),
        Kill_Right_Unavailable(119,"Kill Right Unavailable"),
        Kill_Right_Unavailable_Open(120,"Kill Right Unavailable Open"),
        Declare_War(121,"Declare War"),
        Offered_Surrender(122,"Offered Surrender"),
        Accepted_Surrender(123,"Accepted Surrender"),
        Made_War_Mutual(124,"Made War Mutual"),
        Retracts_War(125,"Retracts War"),
        Offered_To_Ally(126,"Offered To Ally"),
        Accepted_Ally(127,"Accepted Ally"),
        Character_Application_Accept(128,"Character Application Accept"),
        Character_Application_Reject(129,"Character Application Reject"),
        Character_Application_Withdraw(130,"Character Application Withdraw"),
        Clone_activated_(138,"Clone activated"),
        Loss_report_available(140,"Loss report available"),
        Kill_report_available(141,"Kill report available"),
        Entosis_Link_started(147,"Entosis Link started"),
        Entosis_Link_enabled_a_module(148,"Entosis Link enabled a module"),
        Entosis_Link_disabled_a_module(149,"Entosis Link disabled a module"),
        DustAppAcceptedMsg_(131,"DustAppAcceptedMsg ?"),
        DistrictAttacked_(132,"DistrictAttacked ?"),
        BattlePunishFriendlyFire_(133,"BattlePunishFriendlyFire ?"),
        BountyESSTaken_(134,"BountyESSTaken ?"),
        BountyESSShared_(135,"BountyESSShared ?"),
        IndustryTeamAuctionWon_(136,"IndustryTeamAuctionWon ?"),
        IndustryTeamAuctionLost_(137,"IndustryTeamAuctionLost ?"),
        Corporation_invitation_accepted_(139,"Corporation invitation accepted (CorpAppInvitedMsg)"),
        Corporation_application_rejected_(142,"Corporation application rejected (CorpAppRejectCustomMsg)"),
        Friendly_fire_enable_timer_started_(143,"Friendly fire enable timer started (CorpFriendlyFireEnableTimerStarted)"),
        Friendly_fire_disable_timer_started_(144,"Friendly fire disable timer started (CorpFriendlyFireDisableTimerStarted)"),
        Friendly_fire_enable_timer_completed_(145,"Friendly fire enable timer completed (CorpFriendlyFireEnableTimerCompleted)"),
        Friendly_fire_disable_timer_completed_(146,"Friendly fire disable timer completed (CorpFriendlyFireDisableTimerCompleted)"),
        Infrastructure_hub_bill_about_to_expire_(152,"Infrastructure hub bill about to expire (InfrastructureHubBillAboutToExpire)"),
        Sovereignty_structure_reinforced_(160,"Sovereignty structure reinforced (SovStructureReinforced)"),
        SovCommandNodeEventStarted_(161,"SovCommandNodeEventStarted ?"),
        Sovereignty_structure_destroyed_(162,"Sovereignty structure destroyed (SovStructureDestroyed)"),
        SovStationEnteredFreeport_(163,"SovStationEnteredFreeport ?"),
        IHubDestroyedByBillFailure_(164,"IHubDestroyedByBillFailure ?"),
        BuddyConnectContactAdd_(166,"BuddyConnectContactAdd ?"),
        AllianceCapitalChanged(165,"Alliance capital changed (AllianceCapitalChanged)"),
        SovStructureSelfDestructRequested(167,"Sovereignty structure self destruction requested (SovStructureSelfDestructRequested)"),
        SovStructureSelfDestructCancel(168,"Sovereignty structure self destruction canceled (SovStructureSelfDestructCancel)"),
        SovStructureSelfDestructFinished(169,"Sovereignty structure self destruction completed (SovStructureSelfDestructFinished)"),
        StructureFuelAlert(181,"Structure fuel alert (StructureFuelAlert)"),
        StructureAnchoring(182,"Structure anchoring started (StructureAnchoring)"),
        StructureUnanchoring(183,"Structure unanchoring started (StructureUnanchoring)"),
        StructureUnderAttack(184,"Structure under attack (StructureUnderAttack)"),
        StructureOnline(185,"Structure Online (StructureOnline)"),
        StructureLostShields(186,"Structure lost shields (StructureLostShields)"),
        StructureLostArmor(187,"Structure lost Armor (StructureLostArmor)"),
        StructureDestroyed(188,"Structure destroyed (StructureDestroyed)"),
        StructureServicesOffline(198,"Structure service offline (StructureServicesOffline)"),
        StructureItemsDelivered(199,"Item delivered (StructureItemsDelivered)"),
        StructureCourierContractChanged(201,"StructureCourierContractChanged ?"),
        OperationFinished(1012,"OperationFinished ?"),
        GameTimeReceived(1030,"Game time received (GameTimeReceived)"),
        GameTimeSent(1031,"Game time sent (GameTimeSent)"),
        UNKNOWN(0, "Unknown notification type");

        private final int id;
        private final String description;

        private NotificationType(final int id, final String description) {
            this.id = id;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public static NotificationType get(final int typeID) {
            for (final NotificationType notificationType : values()) {
                if (notificationType.getId() == typeID) {
                    return notificationType;
                }
            }
            return UNKNOWN;
        }
    }

    public long getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(final long notificationID) {
        this.notificationID = notificationID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(final int typeID) {
        this.typeID = typeID;
    }

    public NotificationType getType() {
        return NotificationType.get(typeID);
    }

    public long getSenderID() {
        return senderID;
    }

    public void setSenderID(final long senderID) {
        this.senderID = senderID;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(final Date sentDate) {
        this.sentDate = sentDate;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(final boolean read) {
        this.read = read;
    }

    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
