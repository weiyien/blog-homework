<#-- Layout -->
<#macro layout title>
    <!DOCTYPE html>
    <html lang="zh-CN">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--[if IE]>
        <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'/>
        <![endif]-->

        <title>${title?default('weiyien')}</title>

    </head>
    <body>

    <#nested>

    </body>
    </html>
</#macro>