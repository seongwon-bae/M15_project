package com.example.k_league

class TeamDataParsing {
    private var team_name = ""
    private var team_explanation = ""
    private var team_logo = ""
    private var team_rank = ""
    private var team_manager = ""
    private var team_fw = ""
    private var team_mf = ""
    private var team_df = ""
    private var team_gk = ""

    public fun getTeamName(): String {
        return team_name
    }

    public fun getTeamExplanation(): String {
        return team_explanation
    }

    // url
    public fun getTeamLogo(): String {
        return team_logo
    }

    public fun getTeamRank(): String {
        return team_rank
    }

    public fun getTeamManager(): String {
        return team_manager
    }

    public fun getTeamFW(): String {
        return team_fw
    }

    public fun getTeamMF(): String {
        return team_mf
    }

    public fun getTeamDF(): String {
        return team_df
    }

    public fun getTeamGK(): String {
        return team_gk
    }
}