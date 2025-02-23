package cn.xeblog.plugin.tools.read;

import cn.xeblog.plugin.annotation.DoTool;
import cn.xeblog.plugin.tools.read.page.*;
import cn.xeblog.plugin.tools.AbstractTool;
import cn.xeblog.plugin.tools.Tools;

/**
 * @author LYF
 * @date 2022-07-18
 */
@DoTool(Tools.READ)
public class Read extends AbstractTool {
    @Override
    protected void init() {
        mainPanel.removeAll();
        mainPanel.setLayout(null);
        mainPanel.setEnabled(true);
        mainPanel.setVisible(true);

        UIManager.mainPanel = mainPanel;
        UIManager.startPage = new StartPage();
        UIManager.settingPage = new SettingPage();
        UIManager.bookshelfPage = new BookshelfPage();
        UIManager.directoryPage = new DirectoryPage();

        UIManager.startPage.show();
    }

    @Override
    public void over() {
        super.over();
        ReadPage readPage = UIManager.readPage;
        if (readPage != null) {
            readPage.dispose();
        }
    }
}
