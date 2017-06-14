
package event_schedular;

public class Welcome extends javax.swing.JFrame {
    
    public Welcome() {
        initComponents();
    }
    /*
    An Event scheduling system should be based on a client-server architecture where
client can login/register on the server. Once registered they can book time slots for
any free classroom(s) on a particular day as per availability displayed to them. The
client sends a booking request to the server for a particular venue and date/time
slot and the server, which may have received multiple requests for the same venue,
selects booking of one request on some basis(e.g. First come first serve) and sends
failure response to the others.
    Basic Features:
1. Ability to add in new venues and allowed time slots of the venues at the
server.
2. Ability to define some other policies like some user groups blocked in this
venue.
3. Client should not be allowed to book more than one-time slot in a single day
for a single venue.
4. Client should be able to view the event schedule and availabilities for a
venue in different perspectives such as: day-wise /week-wise /time-slot
wise, etc. (Extra marks for graphical display of event schedule).
5. Ability to demand a fixed time slot like morning time slot such as 8-10 AM
or a variable request like any free time slot on a particular day.
6. Once the booking request is granted, an event should be created
corresponding to that booking.
7. Client who initiated booking can add other registered clients directly to the
created event. Other clients should have the ability to accept or reject the
event invitation.
    Advanced Features:
1. Client can share a file such as any pdf or doc to describe the event.
2. If the requested time slot is not available, then the server must suggest the
client with possible free time slots relative to the requested one.
3. Client can a send a large range of time slots and request for any free slot if
available in the given range.
4. The Events can be made public or private (only two categories).
5. The ability for other clients to view all the public events registered on the
server and hence request to join an event. Request sent to event creator.
6. Ability for client can do multiple booking at the same time (at different
venues or at different dates).
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msglabel.setText("Welcome to Event Schedular :-)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(msglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(msglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel msglabel;
    // End of variables declaration//GEN-END:variables
}
