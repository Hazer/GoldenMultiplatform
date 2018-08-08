
import UIKit
import Golden

class MainViewController: UIViewController {
    @IBOutlet weak var lblTest: UILabel!
    
    var viewModel = GoldenMainViewModel()

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        print("View Model Text: \(self.viewModel.helloText)")
        
        self.lblTest.text = self.viewModel.helloText
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

