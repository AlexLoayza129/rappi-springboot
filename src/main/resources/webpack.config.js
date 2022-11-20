const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    entry: './public/js/index.js',
    output: {
        path: path.resolve(__dirname, './dist'),
        filename: 'bundle.js',
        assetModuleFilename: 'images/[hash][ext][query]'
    },
    module:{
        rules:[
            {
                test: /\.js$/,
                loader: 'babel-loader'
            },
            {
                test: /\.css$/i,
                use: [
                  {
                    loader: 'style-loader',
                    options: { 
                        insert: 'head', // insert style tag inside of <head>
                        injectType: 'singletonStyleTag' // this is for wrap all your style in just one style tag
                    },
                  },
                  "css-loader",
                ],
            },
            {
                test: /\.(png|jpe?g|gif|webp|svg)$/i,
                use: [
                  {
                    loader: 'file-loader',
                  }
                ]
            },
        ]
    },
    plugins:[
        new HtmlWebpackPlugin({
            template: './public/index.html'
        })
    ]
};