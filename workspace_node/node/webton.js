const {chromium} = require('playwright');
getwebtoon()
async function getwebtoon(){
   const browser = await chromium.launch({
        headless: false
    });

    const ctx = await browser.newContext()
    const page  = await ctx.newPage()
    await page.goto("https://comic.naver.com/webtoon")

    // input에 글쓰기
    // await page.fill('css', 'admin')

    // click 이벤트 주기
    // await page.click('css')

    await page.waitForSelector('#container')
    const ul = await page.$('#container ul')
    console.log(ul.innerHTML())

    page.screenshot({ path: 'a.png'})
}