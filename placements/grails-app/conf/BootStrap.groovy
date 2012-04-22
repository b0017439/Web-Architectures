import placements.Status
class BootStrap {

    def init = { servletContext ->
        def appliedstatus = new Status(code:'01',description:'Applied').save();
        def notInvitedstatus = new Status(code:'02',description:'Not invited for Interview').save();
        def invitedstatus = new Status(code:'03',description:'Invited for Interview').save();
        def notOfferedtatus = new Status(code:'04',description:'Not Offered').save();
        def offeredstatus = new Status(code:'05',description:'Offered').save();
        def acceptedstatus = new Status(code:'06',description:'Accepted').save();
        def rejectedstatus = new Status(code:'01',description:'Rejected').save();


    }
    def destroy = {
    }
}
