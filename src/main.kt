
import mainForm.*
import javax.swing.UIManager

fun main() {

    // set the style of the forms to match the operating system
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())

    val window = mainForm()

    window.isVisible = true

}